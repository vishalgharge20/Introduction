import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class Greenkart {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");

        List<WebElement> names = driver.findElements(By.xpath("//div[@class='products']/div[@class='product']/h4[@class='product-name']"));

        List<WebElement> incrementButtons = driver.findElements(By.xpath("//a[@class='increment']"));
        List<WebElement> addToCartButtons = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

        String item_req = "Carrot";

        // if we need to add mulitple items, we need to keep it in array and verify it in for loop
        String[] item_list = {"Apple", "Walnuts"};

        int item_num = 3;

//        for(WebElement name: names){
//                System.out.println(name.getText());
//        }

//        // Example for single item
//        for (int i = 0; i < names.size(); i++) {
//            String name = names.get(i).getText();
//            if (name.contains(item_req)) {
//                for (int j = 1; j < item_num; j++) {
//                    driver.findElements(By.xpath("//a[@class='increment']")).get(i).click();
//                }
//                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//                break;
//            }
//        }

        // Example for multiple item
        int counter = 0;
            //for (int i = 0; i < names.size() && counter < item_list.length; i++) {
            for (int i = 0; i < names.size(); i++) {
                String[] name = names.get(i).getText().split("-");   // we should trim the name to match item_list
                String formatted_name = name[0].trim();
                List<String> item_al = Arrays.asList(item_list);
                if (item_al.contains(formatted_name)) {
                    for (int j = 1; j < item_num; j++) {
                        incrementButtons.get(i).click();
                        System.out.println(i);
                    }
                    addToCartButtons.get(i).click();
                    System.out.println(formatted_name);
                    counter++;
                }
                if(counter==3){
                    break;
                }
            }
        System.out.println(counter);

        }
}
























