package autosuggestiondropdown_and_static_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Google_search {
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/webhp?hl=en&sa=X&ved=0ahUKEwiPxIa20ouIAxU3rlYBHRlDHmgQPAgI");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));


        driver.findElement(By.xpath("//div[@jsname=\"RNNXgb\"]")).click();
        System.out.println("set1");
        driver.findElement(By.xpath("//textarea[@class=\"gLFyf\"]")).sendKeys("selenium");
        System.out.println("set2");
        Thread.sleep(2000);
        System.out.println("set3");
        List<WebElement> searchlist = driver.findElements(By.xpath("//li[@class=\"sbct PZPZlf sbre\"]"));
        System.out.println(searchlist.size());

      for (WebElement loopelement:searchlist){

        if (
                loopelement.getText().equals("selenium")
        ) {
            System.out.println("set5");
            loopelement.click();
            break;
        }

    }
    }
}
