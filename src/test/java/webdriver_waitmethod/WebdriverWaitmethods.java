package webdriver_waitmethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebdriverWaitmethods {
    public static void main(String[] args){

    WebDriver driver = new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://testautomationpractice.blogspot.com/");
    driver.manage().window().maximize();





    }
}
