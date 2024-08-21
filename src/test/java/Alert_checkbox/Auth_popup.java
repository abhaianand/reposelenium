package Alert_checkbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Auth_popup {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://admin:admin@the-internet.herokuapp.com/digest_auth"); //pass username and password in url
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();






    }
}
