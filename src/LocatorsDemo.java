import java.time.Duration;

import jdk.jfr.Timespan;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("inputUsername")).sendKeys("vishal@gmail.com");   
		driver.findElement(By.name("inputPassword")).sendKeys("123456");
		
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.id("chkboxTwo")).click();
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
	
		
		String Actual_error = driver.findElement(By.xpath("//p[@class='error']")).getText();
		System.out.println(Actual_error);
		String Expected_error = "* Incorrect username or password";
		
		if(Actual_error.equals(Expected_error)) {
		System.out.println("Test Case Passed");
		}
		else {
		System.out.println("Test Case Failed");
		}
		
		driver.findElement(By.partialLinkText("password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();  // Element intercepted error -  This will fail as the page transition is going on and we should add a wait statement


		//driver.quit();
		

	}

}

