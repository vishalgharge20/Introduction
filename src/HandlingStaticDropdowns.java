import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class HandlingStaticDropdowns {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        //WebDriver driver = new EdgeDriver();

        driver.manage().window().maximize();

        // add wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");


//        // Drop down with select tag - static DropDown
//        WebElement staticDropdown = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
//        Select dropdown = new Select(staticDropdown);
//        // Selecting index 3 [USD]
//        dropdown.selectByIndex(3);
//        // checking selected option text
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        // selecting by visible text [INR]
//        dropdown.selectByVisibleText("INR");
//        // checking selected option text
//        System.out.println(dropdown.getFirstSelectedOption().getText());
//        // selecting by value [AED]
//        dropdown.selectByValue("AED");
//        // checking selected option text
//        System.out.println(dropdown.getFirstSelectedOption().getText());




        // Handling Dropdowns without select

        // clicking on passenger dropdown
        driver.findElement(By.id("divpaxinfo")).click();

        // now click on plus mark to add adult:
        // we need to add 4 adults, so we should use loops

//        for(int i=1;i<4;i++){
//            driver.findElement(By.id("hrefIncAdt")).click(); // 4 clicks
//        }
        // OR
        int i = 1;
        while (i<4){
            driver.findElement(By.id("hrefIncAdt")).click(); // 4 clicks
            i++;
        }

        // clicking on Done
        driver.findElement(By.id("btnclosepaxoption")).click();

        // verify that 4 Adult have been selected
        String adultSelected = driver.findElement(By.id("divpaxinfo")).getText();
        if (adultSelected.equals("4 Adult")){
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Test Failed");
        }



    }
}
