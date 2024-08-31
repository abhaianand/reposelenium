package Datadriven_function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.time.Duration;

public class FixedDeposit {
    public static String dropdownvalue_tenure;
    public static String dropdownvalue_frequency;

    public static void main(String args[]) throws IOException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html?classic=true");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        String xlfilepath = System.getProperty("user.dir")+"\\TestData\\interest.xlsx";
       int rowcount_1 = Excel_utility.getRowCount(xlfilepath,"Sheet1");








        driver.findElement(By.xpath("//input[@id=\"principal\"]")).sendKeys();//principal value send
        driver.findElement(By.xpath("//input[@id=\"interest\"]")).sendKeys();//interest value send
        driver.findElement(By.xpath("//input[@id=\"tenure\"]")).sendKeys();//period
        //dropdown - tenure
        WebElement dropdown_tenure =  driver.findElement(By.xpath("//select[@id=\"tenurePeriod\"]"));
        Select select = new Select(dropdown_tenure);
        select.selectByValue(dropdownvalue_tenure);



        //dropdown - frequency

       WebElement dropdown_frequency=  driver.findElement(By.xpath("//select[@id=\"frequency\"]"));
       Select select1 = new Select(dropdown_frequency);
       select1.selectByVisibleText(dropdownvalue_frequency);




















    }

}

