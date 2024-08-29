package DataDriven_testing;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Write_data_in_excel {

    public static void main(String args[]) throws IOException {

        //open the file in writing mode

        FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\writebook.xlsx");

        //open the workbook
        XSSFWorkbook workbook = new XSSFWorkbook(); //dont pass the file into workbook , for writing the data , fire create data the only pass every data into the system

        //create sheet with a name
        XSSFSheet sheet = workbook.createSheet("sheetname");
        //inside sheet we have to create rows and cells and write data

        XSSFRow firstrow  = sheet.createRow(0);
        firstrow.createCell(0).setCellValue("name");
        firstrow.createCell(1).setCellValue("haii");
        firstrow.createCell(2).setCellValue(123);

        XSSFRow secondrow = sheet.createRow(1);
        secondrow.createCell(0).setCellValue("okk");
        secondrow.createCell(1).setCellValue(356);
        secondrow.createCell(2).setCellValue(111);

        workbook.write(file);
        workbook.close();
        file.close();
        System.out.println("file created");

    }
}
