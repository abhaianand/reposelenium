package DataDriven_testing;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_data_dynamically {


    public static void main(String args[]) throws IOException {


        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir") + "\\TestData\\dynamic.xlsx");

        XSSFWorkbook workbook = new XSSFWorkbook();

      XSSFSheet sheet = workbook.createSheet("sheetname");






      workbook.write(file);
      workbook.close();
      file.close();
        System.out.println("file created");








    }
}
