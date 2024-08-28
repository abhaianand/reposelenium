package broken_link_svg_element_shadowDOM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class BrokenLink {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("http://www.deadlinkcity.com/");

        // Get all the links on the webpage
        List<WebElement> linkElements = driver.findElements(By.tagName("a"));
        int totalNumberOfLinks = linkElements.size();
        System.out.println("Total number of links: " + totalNumberOfLinks);

        for (WebElement linkElement : linkElements) {  //using for loop pass the all elements into the loop
            String hrefValue = linkElement.getAttribute("href"); // get the href values of all the tage we located

            if (hrefValue == null || hrefValue.isEmpty()) {
                System.out.println("Link is either null or empty");
                continue;
            }

            try {
                URL url = new URL(hrefValue);  //the return value of all the href is string so convert the same to URl format
                HttpURLConnection connection = (HttpURLConnection) url.openConnection(); // start connection with the server

                connection.connect(); //  send the url to the server

                int responseCode = connection.getResponseCode();  // and get the response code of each request

                if (responseCode >= 400) {  // check the response code is more than 400 or not
                    System.out.println(hrefValue + " is a broken link");
                } else {
                    System.out.println(hrefValue + " is a valid link");
                }

                connection.disconnect();

            } catch (MalformedURLException e) {
                System.out.println("Malformed URL: " + hrefValue);
            } catch (IOException e) {
                System.out.println("IOException for URL: " + hrefValue);
            }
        }

        driver.quit();
    }
}
