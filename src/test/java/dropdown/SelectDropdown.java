package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class SelectDropdown {
    public static void main(String args[]) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //first locate the parent web element of the dropdown

      WebElement parentdropdown = driver.findElement(By.xpath("//select[@id=\"country\"]"));
       //in selenium we have a class called select , so pass the aprent dropdown elemnt into the object of select class

        Select dropdwon = new Select(parentdropdown);
        dropdwon.selectByIndex(6); //japan
        Thread.sleep(3000);
        dropdwon.selectByValue("germany");//german
        Thread.sleep(3000);
        dropdwon.selectByVisibleText("United Kingdom");//uk


    }
}
