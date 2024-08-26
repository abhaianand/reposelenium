package autosuggestiondropdown_and_static_web_table;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Statictable {
    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
         driver.get("https://testautomationpractice.blogspot.com/");
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         //find total number of rows in table
        //2 approach
        //first approach - total number of tr = number of rows
       List<WebElement> tablelement = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr"));
       System.out.println(tablelement.size()+" actual row table count");
       //find total number of columns
        //find out howmany table header are there in the first tr
       int a = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//th")).size();
        System.out.println(a+" actual table  column count");
        // read data from specific column and row - 5th roww and first column
        String textof5_1 = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText();
        System.out.println(textof5_1);
        //read data from all the rows and column
       int rows_count = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr")).size();
       int column_count = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tr//th")).size();


        for (int r =2;r<=rows_count;r++){

            for (int c=1;c<=column_count;c++){
                //for every iteration we have to pass column number and row number to the tr and td so for that syntax "+r+" and "+c+"
               String values =  driver.findElement(By.xpath( "//table[@name=\"BookTable\"]//tr["+r+"]//td["+c+"]")).getText();
                System.out.print("  "+values);

                 }
            System.out.println("  ");

             }
        // print name of books written by mukesh
        for(int r1=2;r1<=rows_count;r1++){
          String name_of_author = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r1+"]//td[2]")).getText();
          if (name_of_author.equals("Mukesh")){
              String name_of_book = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r1+"]//td[1]")).getText();
              System.out.println(name_of_book);
          }
        }

        //find out the total amount of price
          int total_amount =0;
         for(int r3=2;r3<=rows_count;r3++){
             String price_of_books = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+r3+"]//td[4]")).getText();
             //conver string to int
             int price_of_book = Integer.parseInt(price_of_books);
             total_amount = total_amount+price_of_book;
         }
          System.out.println(total_amount);






    }
}
