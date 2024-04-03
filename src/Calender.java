import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calender {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

//        /// click on start date
//        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
//        // select date
//        driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
//
//        /// click on end date
//        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date2']")).click();
//
//        /// initial month
//        String month = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]")).getText();
//        //System.out.println(month);


//        /// click on next arrow to select month when specific month is displayed
//        while (!month.equals("July 2024")){
//            driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
//            Thread.sleep(1000);
//            month = driver.findElement(By.xpath("(//div[@class='ui-datepicker-title'])[2]")).getText();
//        }
//
//        /// select date
//        driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-week-end')]//a[@class='ui-state-default'][normalize-space()='20']")).click();


        /// checking if option is enabled/disabled
        //System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_1']")).click();
        //System.out.println(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style"));

        if(driver.findElement(By.xpath("//div[@id='Div1']")).getAttribute("style").contains("0.5"))
        {
            System.out.println("Round Trip is Disabled");
        }
        else {
            System.out.println("Round Trip is Enabled");
        }



    }
}



/// by using for loop
//        for(int i =0;i<13;i++){
//        if(month.equals("July 2024")){
//        Thread.sleep(1000);
//        break;
//        }
//        else {
//        driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();
//        Thread.sleep(1000);
//        month = driver.findElement(By.cssSelector(".ui-datepicker-title")).getText();
//        }
//        }
//        System.out.println(month);