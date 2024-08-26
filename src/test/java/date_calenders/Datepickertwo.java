package date_calenders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Datepickertwo {

    public static void main(String[] args) {
        // Set up WebDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // Switch to the iframe containing the date picker
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='frame-one796456169']")));

        // Click on the date picker input field to open the calendar
        driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

        // Define the expected date values
        String expected_year = "2025";
        String expected_month = "August";
        String expected_day = "3";

        // Loop to select the desired month and year
        while (true) {
            // Get the current month and year displayed in the date picker
            String current_month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
            String current_year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();

            // Check if the current month and year match the expected values
            if (current_month.equals(expected_month) && current_year.equals(expected_year)) {
                // Select the desired day
                driver.findElement(By.xpath("//a[text()='" + expected_day + "']")).click();
                break;
            } else if (!current_year.equals(expected_year)) {
                // Select the year if it's different from the expected year
                Select yearSelect = new Select(driver.findElement(By.xpath("//select[@aria-label='Select year']")));
                yearSelect.selectByVisibleText(expected_year);
            } else {
                // Click the "Next" button to navigate to the next month if the year is correct but the month is not
                driver.findElement(By.xpath("//a[@data-handler='next']")).click();
            }
        }

        // Optionally switch back to the main content if needed
        driver.switchTo().defaultContent();

        // Close the browser
        driver.quit();
    }
}
