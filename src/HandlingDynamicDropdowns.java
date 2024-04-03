import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HandlingDynamicDropdowns {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

//        // From
//        driver.findElement(By.cssSelector("a[value='BLR']")).click();
//        //wait
//        Thread.sleep(1000);
//        // To
//        driver.findElement(By.xpath("(//a[@value='BOM'][normalize-space()='Mumbai (BOM)'])[2]")).click();

        //// Another way to do it without index [parent to child traverse]

        // From
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='BLR']")).click();
        //wait
        Thread.sleep(1000);
        // To
        driver.findElement(By.xpath(" //div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='BOM']")).click();







    }
}

