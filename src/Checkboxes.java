import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Checkboxes {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        // clicking on checkbox
//        System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
//        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).click();
//        System.out.println(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());



        /// Using assertion
        Assert.assertFalse(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_StudentDiscount']")).isSelected());



        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        int count =checkboxes.size();

        System.out.println("Checkbox " + count);
        Assert.assertEquals(count,6);

//        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//        int count = 0;
//        for (WebElement checkbox : checkboxes) {
//            count++;
//        }
//        System.out.println(count);



        }

    }

