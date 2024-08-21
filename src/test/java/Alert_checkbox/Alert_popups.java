package Alert_checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alert_popups {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();

        //Normal alert with single button

        driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]")).click();
      Alert myalert =  driver.switchTo().alert();  // switch to jump from page to alert , alert return the details of alert and accept keyword accept the alert
     String a = myalert.getText();  //to get the text in alert
        System.out.println(a);
        Thread.sleep(2000);
        myalert.accept();


        //confirmation alert ,both ok and cancel
        driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
        Alert confirmation_alert = driver.switchTo().alert();
        String b =  confirmation_alert.getText();
        System.out.println(b);
        Thread.sleep(2000);
        confirmation_alert.dismiss(); // dismiss used to close the confirmation alert

        //alert with input box
        driver.findElement(By.xpath("//button[text()=\"Click for JS Prompt\"]")).click();
        Thread.sleep(2000);
        Alert inputalert = driver.switchTo().alert();
        Thread.sleep(2000);
        inputalert.sendKeys("welcome");  //ohh during running we cant see in the value passed

        Thread.sleep(2000);
        inputalert.accept();





    }
}
