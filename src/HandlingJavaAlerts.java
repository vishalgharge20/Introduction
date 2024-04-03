import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingJavaAlerts {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        driver.findElement(By.id("name")).sendKeys("Testing");
        driver.findElement(By.cssSelector("[id='alertbtn']")).click();

        // handling alerts
        driver.switchTo().alert().accept();


        driver.findElement(By.id("name")).sendKeys("Testing");
        driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();

        // handling alerts
        //driver.switchTo().alert().accept();


        String text = driver.switchTo().alert().getText();
        driver.switchTo().alert().dismiss();
        System.out.println(text);


    }
}
