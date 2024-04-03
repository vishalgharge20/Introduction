
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import java.time.Duration;

public class Login {
    public static void main(String[] args) throws InterruptedException {

        // initialize the web-driver:
        WebDriver driver = new ChromeDriver();

        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // navigate to the url
        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        // maximize window:
        driver.manage().window().maximize();

        // click on username and fill details
        driver.findElement(By.cssSelector("input[id*=User]")).sendKeys("vishal@qa.com");

        // fill password [Wrong]
        driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("vishal123");

        // tick checkboxes
        driver.findElement(By.cssSelector("input[id=chkboxOne]")).click();
        driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click();

        // click on sign
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();

        // write an if/else statement to verify
        String current_page_title = (driver.getTitle());
        if(!current_page_title.equals("Rahul Shetty Academy - Login page")) {
            System.out.println(current_page_title);
            System.out.println("Test Passed");
        }
        else{
                System.out.println("Test Failed");
            }



        //// Forgot Password

        // Click on forgot password
        driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();

        // add wait to wait until animation is done
        Thread.sleep(1000);

        // enter name
        driver.findElement(By.cssSelector("input[placeholder='Name']")).sendKeys("Vishal");
        //enter email
        driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("vishal@qa.com");
        // enter phone number
        driver.findElement(By.xpath("//input[contains(@placeholder,'Phone')]")).sendKeys("1234567890");

        // click on Reset login
        driver.findElement(By.xpath("//button[contains(@class,'reset')]")).click();

        // verify the text displayed when we click reset button
        String Displayed_text = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
        String Actual_text = "Please use temporary password 'rahulshettyacademy' to Login.";
        if (Displayed_text.equals(Actual_text)){
            System.out.println("Test2 Passed");
        }
        else {
            System.out.println("Test2 Failed");
        }



        //// Login using new password
        driver.findElement(By.xpath("//button[contains(@class,'go-to-login-btn')]")).click();

        // sleep
        Thread.sleep(1000);

        // click on username and fill details
        driver.findElement(By.cssSelector("input[id*=User]")).clear();
        driver.findElement(By.cssSelector("input[id*=User]")).sendKeys("vishal@qa.com");

        // fill password [Wrong]
        driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).clear();
        driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys("rahulshettyacademy");


        // click on sign
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();

        // verify if it is loged in
        String welcome = driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText();
        String Actual = "You are successfully logged in.";

        Assert.assertEquals(welcome,Actual);

//        if (welcome.equals(Actual)){
//            System.out.println("Test Passed");
//        }
//        else {
//            System.out.println("Test Failed");
//        }


        // logout
        driver.findElement(By.cssSelector(".logout-btn")).click();

        // Close the browser
        driver.close();


        }


        // creating a method to store password, to avoid hardcoding password


    public String getPassword(WebDriver driver)
    {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
        String passwordText = driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
        //Please use temporary password 'rahulshettyacademy' to Login.

        String [] arr1 = passwordText.split("'");
        String rightsplit = arr1[1];

        String [] arr2 = rightsplit.split("'");
        String pass = arr2[0];

        System.out.println(pass);
        return pass;
    }


    }
