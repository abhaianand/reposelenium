package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); //object creation and instance creation
        driver.get("https://demo.opencart.com/"); // load the url
        driver.manage().window().maximize(); //full screen windows
        Thread.sleep(3000);



        //xpath with single attributes
        //driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Tshirts");
        //xpath with multiple attributes
       // driver.findElement(By.xpath("//input[@type=\"text\"][@placeholder=\"Search\"]")).sendKeys("Tshirts");
        //in multi taribute limitation if any one attribute is wrong we will get error message
       // xpath with and ,or operators
        //and - both should be math
        //driver.findElement(By.xpath("//input[@type=\"text\" and @placeholder=\"Search\"]")).sendKeys("Tshirts");
       // System.out.println("ok");
        //xpath - or
       // driver.findElement(By.xpath("//input[@type=\"text\" or @placeholder=\"Search\"]")).sendKeys("Tshirts");

        //xpath with inner text
        //a[text()='Desktops']
        driver.findElement(By.xpath("//a[text()='Desktops']")).click();
        System.out.println("ok");





    }
}
