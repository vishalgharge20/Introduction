import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class Assignment1 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());
        driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).click();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@name='checkBoxOption1']")).isSelected());

        // number checkboxes present
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkboxes.size());

    }
}
