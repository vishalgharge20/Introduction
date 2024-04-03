
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class demo_iframe {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		new Actions(driver).scrollToElement();
		driver.switchTo().frame("iframe-name");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div/div/div/div/div/div/div/a")).click();
		
		
		
		

	}
}
