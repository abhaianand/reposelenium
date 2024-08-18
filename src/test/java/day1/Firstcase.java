package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstcase {
    public static void main(String args[]){

        System.out.println("haii");
        WebDriver  driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
      String actual_title = driver.getTitle();
      if (actual_title.equals("Your Store")){
          System.out.println("Test case pass");
      }
      else {
          System.out.println("Test case fail");

      }
      driver.quit();
    }
}
