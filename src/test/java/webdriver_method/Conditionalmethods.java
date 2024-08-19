package webdriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Conditionalmethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        Thread.sleep(2000);
        driver.manage().window().maximize();


        //isDisplayed - verify that the logo is displayed or not
      WebElement logo =  driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")); //find element always return webelemet so return type is element not string
// check the logo is presnst or not use is displayed

        System.out.println(logo.isDisplayed());

        //isenable - use for check box,radio button,dropdown etc ..aslo we can check the input box is inable or not








    }

}
