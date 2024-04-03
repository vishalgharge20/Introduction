import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class AutoSuggestiveDropdowns {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Use Duration object instead of int

        Actions actions = new Actions(driver);

        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

        WebElement autoSuggest = driver.findElement(By.xpath("//input[@id='autosuggest']"));
        autoSuggest.sendKeys("ind");

        // Wait for the suggestion box to appear
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li[class='ui-menu-item']")));

        // List of the suggestions
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase("india")) {
                // Scroll into view
                ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", option);

                // Move to the element
                actions.moveToElement(option).perform();

                // Click on the element
                wait.until(ExpectedConditions.elementToBeClickable(option)).click();
                break;
            }
        }

        // Close the browser
        driver.quit();
    }
}



