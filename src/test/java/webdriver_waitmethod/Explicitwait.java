package webdriver_waitmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Explicitwait {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait waitobj = new WebDriverWait(driver,Duration.ofSeconds(5)); //declare

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        //explicit wait condition
     WebElement webelement_name = waitobj.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));

        webelement_name.sendKeys("abhai");
    }
}
