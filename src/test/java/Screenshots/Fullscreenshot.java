package Screenshots;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.time.Duration;

public class Fullscreenshot {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        System.out.println(System.getProperty("user.dir"));

        File target = new File(System.getProperty("user.dir")+"\\src\\test\\screenshottbug\\BUGSCREENSHOT.png");
        source.renameTo(target);
        System.out.println("all set");
        Thread.sleep(3000);
        driver.close();


    }
}
