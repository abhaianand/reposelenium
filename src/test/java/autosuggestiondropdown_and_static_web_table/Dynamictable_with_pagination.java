package autosuggestiondropdown_and_static_web_table;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Dynamictable_with_pagination {
    public static void main(String  args[]) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo3x.opencartreports.com/admin/index.php?route=common/login");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(By.xpath("//input[@id=\"input-username\"]")).sendKeys("demo");
        driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys("demo");
        driver.findElement(By.xpath("//button[@class=\"btn btn-primary\"]")).click();

        driver.findElement(By.xpath("//body/div[@id='container']/div[@id='content']/div[2]/div[1]/div[1]/div[1]/div[3]/a[1]")).click();

        //step 1 -  read the total number of page / inorder to read the data in
        // between the string use string class substring
        String total_page_string_value = driver.findElement(By.xpath("//div[@class=\"col-sm-6 text-right\"]")).getText();
        System.out.println(total_page_string_value);
        int starting_index =  total_page_string_value.indexOf("(")+1;
        int ending_index = total_page_string_value.indexOf("Pages")-1;

        String total_page = total_page_string_value.substring(starting_index, ending_index);

        //convert string to int
        int total_page_count = Integer.parseInt(total_page);

        //now clicks the all page number to the last page number
        //so whe page load it will show first page so you have to go through the 2 page to final
        //only
        for(int p =1;p<=total_page_count;p++) {

            if (p > 1) {
                driver.findElement(By.xpath("//div[@class=\"col-sm-6 text-left\"]//*[text()='" + p + "']")).click();
            }

            //read the data from current page
            //read amount customer name Billy Brooks and his total payment
           int numer_of_rows = driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr")).size();
           int number_of_column = driver.findElements(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr[1]//td")).size();
           //loop row
           for(int r=1;r<= numer_of_rows;r++){

             String customer_name_list =  driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+r+"]//td[3]")).getText();
               if(customer_name_list.equals("Billy Brooks")){
                   System.out.println(customer_name_list);
                   //String price = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+r+"]//td["+c+"]")).getText();
                       String price = driver.findElement(By.xpath("//table[@class=\"table table-bordered table-hover\"]//tbody//tr["+r+"]//td[5]")).getText();
                   System.out.println(price);
               }}
             //column loop

               }}
           }



