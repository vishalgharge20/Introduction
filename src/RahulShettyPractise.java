import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.sql.SQLOutput;
import java.time.Duration;
import java.util.List;
import java.util.Set;

public class RahulShettyPractise {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

//
//        // 1. Get the text the of the buttons of the top bar buttons
//        List < WebElement> names = driver.findElements(By.xpath("//button[@class='btn btn-primary']"));
//        for(WebElement name: names){
//            System.out.println(name.getText());
//        }
//
//
//        // 2. Interactive with radio buttons
//
//        WebElement radiobutton1 = driver.findElement(By.xpath("//input[@value='radio1']"));
//        WebElement radiobutton3 = driver.findElement(By.xpath("//input[@value='radio3']"));
//        // click on first radio button
//        radiobutton1.click();
//        // click on last radio button
//        radiobutton3.click();
//        // Assert statement
//        Assert.assertTrue(radiobutton3.isSelected());
//
//
//        // 3. Suggestion class example
//
//        WebElement input_selectCountry = driver.findElement(By.xpath("//input[@class='inputs ui-autocomplete-input']"));
//        // send keys [India]
//        String input_value = "India";
//        input_selectCountry.sendKeys(input_value);
//        // sleep
//        Thread.sleep(1000);
//        // get all the dynamic values and match it and select the option
//        List <WebElement> options = driver.findElements(By.xpath("//li[@class='ui-menu-item']"));
//
//        for (WebElement option: options) {
//            if (option.getText().equals(input_value)){
//                //System.out.println(option.getText());
//                option.click();
//            }
//        }
//        Assert.assertEquals(input_selectCountry.getAttribute("value"),"India");
//
//
//        // 4. Select DropDown
//
//        WebElement dropdown = driver.findElement(By.id("dropdown-class-example"));
//        // creating select option
//        Select selectButton = new Select(dropdown);
//        // select button by text
//        selectButton.selectByVisibleText("Option3");
//        // Assert
//        //System.out.println(dropdown.getAttribute("value"));
//        Assert.assertEquals(dropdown.getAttribute("value"),"option3");
//
//
//        // 5. Checkbox
//
//        WebElement cb1 = driver.findElement(By.id("checkBoxOption1"));
//        WebElement cb2 = driver.findElement(By.id("checkBoxOption2"));
//        WebElement cb3 = driver.findElement(By.id("checkBoxOption3"));
//
//        // click on 1 and 3
//        cb1.click();
//        //cb2.click();
//        cb3.click();
//        // Assert
//        Assert.assertTrue(cb1.isSelected());
//        Assert.assertTrue(cb3.isSelected());
//
//        // Assert that cb2 is not clicked
//        Assert.assertFalse(cb2.isSelected());


        // 6. Switch Window example
        // original window handle
        String originalHandle = driver.getWindowHandle();
        WebElement switchButton = driver.findElement(By.id("openwindow"));
        // click on the button and verify the title of the page
        switchButton.click();
        // add wait and then Assert
        Thread.sleep(3000);

        for(String windowHandle: driver.getWindowHandles()){
            if(!originalHandle.equals(windowHandle)){
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        driver.manage().window().maximize();
        Assert.assertEquals (driver.getTitle(),"QAClick Academy - A Testing Academy to Learn, Earn and Shine");


        // 7.






















    }
}
