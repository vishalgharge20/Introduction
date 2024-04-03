import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class greenkart1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        List<WebElement> names = driver.findElements(By.xpath("//div[@class='product'] //h4[@class='product-name']"));
        List <WebElement> increment_button = driver.findElements(By.xpath("//div[@class='product'] //a[@class='increment']"));
        List <WebElement> add_to_cart_button = driver.findElements(By.xpath("(//button[@type='button'][normalize-space()='ADD TO CART'])"));

        String [] item_list = {"Carrot","Apple","Walnuts"};

// Define the number of items to add
        int item_num = 3;

// Counter to keep track of added items [item_list]
        int counter = 0;


//  getting the name of the item and splitting and stripping it
        for(int i =0; i<names.size();i++) {
            String name = names.get(i).getText().split(" ")[0].trim();
            //System.out.println(name);
            // changing from array to array list, so that we can use contain method
            List<String> item_al = Arrays.asList(item_list);
            if (item_al.contains(name)) {
                for (int j = 1; j < item_num; j++) {
                    increment_button.get(i).click();
                    Thread.sleep(1);
                }
                add_to_cart_button.get(i).click();

                // since there will be to many items in the page, we can break the loop when items in item|_list is finished
                counter++;
                if (counter == item_list.length) {
                    break;
                }

            }
        }






        }
    }

