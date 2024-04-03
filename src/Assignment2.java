import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment2 {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        driver.findElement(By.xpath("//div[@class='form-group']//input[@name='name']")).sendKeys("Vishal");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("vishal@test.com");
        driver.findElement(By.xpath("//input[@id='exampleInputPassword1']")).sendKeys("vish@1234");
        driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
        WebElement staticdropdown = driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
        Select dropdown = new Select(staticdropdown);
        dropdown.selectByVisibleText("Female");
        driver.findElement(By.xpath("//input[@id='inlineRadio2']")).click();
        driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("20-07-1998");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();

        String success = driver.findElement(By.xpath("//strong[normalize-space()='Success!']")).getText();
        Assert.assertEquals(success,"Success!");





    }
}
