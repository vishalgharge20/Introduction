import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import java.time.Duration;

public class Login1 {
    public static void main(String[] args) throws InterruptedException {

        // initialize the web-driver:
        WebDriver driver = new EdgeDriver();
        // implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        // get password
        String password = getPassword(driver);

        // navigate to the url
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        // maximize window:
        driver.manage().window().maximize();
        // click on username and fill details
        driver.findElement(By.cssSelector("input[id*=User]")).sendKeys("vishal@qa.com");

        // fill password [Wrong]
        driver.findElement(By.xpath("//input[contains(@placeholder,'Pass')]")).sendKeys(password);

        // tick checkboxes
        driver.findElement(By.cssSelector("input[id=chkboxOne]")).click();
        driver.findElement(By.xpath("//input[@name='chkboxTwo']")).click();
        // click on sign
        driver.findElement(By.cssSelector(".submit.signInBtn")).click();

        String welcome = driver.findElement(By.xpath("//p[normalize-space()='You are successfully logged in.']")).getText();
        String Actual = "You are successfully logged in.";
        if (welcome.equals(Actual)){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }
        driver.quit();


    }



    // creating a method to store password, to avoid hardcoding password

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[normalize-space()='Forgot your password?']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
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