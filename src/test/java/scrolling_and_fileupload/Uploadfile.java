package scrolling_and_fileupload;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Uploadfile {

    public static void main(String args[]) throws InterruptedException {
        WebDriver driver =  new ChromeDriver();
        driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        //single file upload
        driver.findElement(By.id("filesToUpload")).sendKeys("C:\\Users\\ABHAI ANAND\\image\\sunflower.jpg");
       String image =  driver.findElement(By.id("fileList")).getText();
        System.out.println(image);
        Thread.sleep(3000);

        //multiple file upload

        driver.navigate().refresh();
        Thread.sleep(3000);

        String a = "C:\\Users\\ABHAI ANAND\\image\\sunflower.jpg";
        String  b = "C:\\Users\\ABHAI ANAND\\image\\sunflower - Copy.jpg";

        driver.findElement(By.id("filesToUpload")).sendKeys(a + "\n" + b);
        String image1 =  driver.findElement(By.id("fileList")).getText();
        System.out.println(image1);


    }

}
