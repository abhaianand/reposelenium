package webdriver_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Getmethods {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");  //open url
        Thread.sleep(2000);

        //get title of the page
        System.out.println(driver.getTitle());
        //get current url
        String currenturl = driver.getCurrentUrl();
        System.out.println(currenturl);
        //getwindowhandle

       // String windowid = driver.getWindowHandle();
       // System.out.println("windowid"+windowid);

        //getwindowshandles- multiple windows
        driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
       Set<String> windowsid = driver.getWindowHandles(); //every window id is string , but here we have morethan one id so it will be set ,
        // why we are using set instead of list because the list can have duplicate data , set not permit duplicate data
        System.out.println(windowsid);












    }

}
