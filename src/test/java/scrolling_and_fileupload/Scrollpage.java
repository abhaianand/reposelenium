package scrolling_and_fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Scrollpage {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        //scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) driver;
        //identify the element to scroll
        WebElement element1 =  driver.findElement(By.xpath("//a[@class=\"home-link\"]"));
        js.executeScript("arguments[0].scrollIntoView(true);", element1);



}}
