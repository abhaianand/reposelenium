package Chromeoptions_Headless_testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless_testing {
    public static void main(String args[]){

        ChromeOptions options = new ChromeOptions(); //chromeoption class object

        options.addArguments("--headless=new"); //method for headless option

        WebDriver driver = new ChromeDriver(options); //pass the method to chromedriver
        driver.get("https://testautomationpractice.blogspot.com/");
        System.out.println(driver.getTitle());
        driver.quit();





    }
}
