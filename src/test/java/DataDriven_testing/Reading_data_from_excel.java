package DataDriven_testing;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Reading_data_from_excel {
    public static void main(String args[]) throws IOException {

        //read data from excel file
        //1 open the excel file in reading mode
        System.out.println(System.getProperty("user.dir"));
        //open the file in reading mode

        FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Book1.xlsx");

        //open the excel sheet or workbook
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //read the sheet from the work book and store it in a variable

         XSSFSheet sheet = workbook.getSheet("Sheet1");

        //find number of rows and number of cells as two dimensional array

       int total_number_of_rows = sheet.getLastRowNum();
       int total_number_of_cells = sheet.getRow(1).getLastCellNum(); //locate first row and find the total number of columns

        System.out.println("total number of  rows = "+total_number_of_rows); //5
        System.out.println("total number of  cells = "+total_number_of_cells);//4

        for(int r =0; r<= total_number_of_rows;r++){

         XSSFRow current_row = sheet.getRow(r);

            for(int c =0;c<total_number_of_cells;c++){
                   XSSFCell current_cell = current_row.getCell(c);
                   String value = current_cell.toString();
                   System.out.print(value+"\t");

            }
            System.out.println(" ");
        }
        workbook.close();
        file.close();



    }
}
