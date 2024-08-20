package navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Navigate {
    public static void main(String args[]) throws MalformedURLException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //url accept only in string format
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

       // URL objurl = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        //driver.navigate().to(objurl);
        //url accept only in string format
        //url accept in url object format
        driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
        Set<String> windows_is = driver.getWindowHandles();

       //approach-1 - convert the set array into list array - only use for small number of windows
       /*List<String> windws_list = new ArrayList(windows_is);
       String parentID = windws_list.get(0);
       String childID = windws_list.get(1);
       System.out.println(driver.getTitle());
       driver.switchTo().window(childID);
       System.out.println(driver.getTitle());*/

       //approcah - 2 if we have toomany tab , the we go for for loop if if else condition
        //enhanced for loop - which mean looping array or foreach loop
        //for(variable type  variable:setarray name)
        for(String wid:windows_is){
            String title = driver.switchTo().window(wid).getTitle();
            if (title.equals("Human Resources Management Software | OrangeHRM")){
                System.out.println(driver.getTitle());
                System.out.println("yes i switch to child");
            }
            else {
                System.out.println("no i am not switch to child");

            }





        }


    }

}
