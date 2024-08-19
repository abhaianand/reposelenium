package webdriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class Conditionalmethods {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.get("https://demoqa.com/automation-practice-form");
        Thread.sleep(2000);
        driver.manage().window().maximize();


        //isDisplayed - verify that the logo is displayed or not
      WebElement logo =  driver.findElement(By.xpath("//img[@alt=\"nopCommerce demo store\"]")); //find element always return webelemet so return type is element not string
      WebElement logo =  driver.findElement(By.xpath("//img[@src=\"/images/Toolsqa.jpg\"]")); //find element always return Webelemet so return type is element not string
// check the logo is presnst or not use is displayed

        System.out.println(logo.isDisplayed());

        //isenable - use for check box,radio button,dropdown etc ..aslo we can check the input box is inable or not
      boolean firstname_status = driver.findElement(By.xpath("//input[@placeholder=\"First Name\"]")).isEnabled();
        System.out.println(firstname_status);


        //isselected - radio button /dropdown etc..

       WebElement  male_radiobutton = driver.findElement(By.xpath("//input[@id=\"gender-radio-1\"]"));
       WebElement fema_leradiobutton =driver.findElement(By.xpath("//label[@for=\"gender-radio-2\"]"));
        System.out.println(male_radiobutton.isSelected()+"  male_radiobutton");
        System.out.println(fema_leradiobutton.isSelected()+"  femal_eradiobutton");
        System.out.println("after selecting male radio button");
        Thread.sleep(3000);


        //driver.findElement(By.xpath("//input[@id=\"gender-radio-1\"]")).click();


       // System.out.println(driver.findElement(By.xpath("//input[@id=\"gender-radio-1\"]")).isSelected()+"  male_radiobutton");

        WebElement maleRadioButton = driver.findElement(By.xpath("//input[@id='gender-radio-1']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", maleRadioButton);
        System.out.println(maleRadioButton.isSelected()+"  male_radiobutton");







    }

}
