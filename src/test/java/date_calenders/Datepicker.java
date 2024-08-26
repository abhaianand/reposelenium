package date_calenders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Datepicker {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@src=\"/resources/demos/datepicker/default.html\"]")));
        driver.findElement(By.id("datepicker")).click();
        String expected_year = "2025";
        String expected_month = "August";
        String expected_day = "3";

        while (true){
            String actual_year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
            String actual_month = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]")).getText();

        if(actual_year.equals(expected_year) && actual_month.equals(expected_month)){
            driver.findElement(By.xpath("//a[text()='" + expected_day + "']")).click();
            break;
        }
        else {
            driver.findElement(By.xpath("//span[text()='Next']")).click();
        }
        }

        //second type


}}
