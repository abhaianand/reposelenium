package Datadriven_function;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Excel_utility {
   public static FileInputStream fi;
    public static FileOutputStream fo;
    public static XSSFWorkbook wb;
    public static  XSSFSheet ws;
    public static XSSFRow row;
    public static XSSFCell cell;
    public static CellStyle style;

    public static int getRowCount( String xlfile,String xlsheet) throws IOException {
        FileInputStream fi = new FileInputStream(xlfile);
        XSSFWorkbook wb = new XSSFWorkbook(fi);
        XSSFSheet ws = wb.getSheet(xlsheet);
        int rowcount = ws.getLastRowNum(); // Adding 1 because rows are 0-indexed
        wb.close();
        fi.close();
        return rowcount;
    }
    public static int getCellCount(String xlfile,String xlsheet,int rownum) throws IOException {
       fi = new FileInputStream(xlfile);
       wb = new XSSFWorkbook(fi);
       ws =wb.getSheet(xlsheet);
       int cellcount = row.getLastCellNum();
       wb.close();
       fi.close();
       return cellcount;
    }

    public static String getCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {

        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rownum);
        cell = row.getCell(colnum);
        String data;

        try {
            //data = celltostring();
            DataFormatter formatter = new DataFormatter();
            data = formatter.formatCellValue(cell); //return the formatted values of a cell as a string regardless of cell type

        } catch (Exception e) {

            data = "";
        }
        wb.close();
        fi.close();
        return data;
    }
    public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException {

        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rownum);

        cell = row.createCell(colnum);
        cell.setCellValue(data);
        fo = new FileOutputStream(xlfile);
        wb.write(fo);
        wb.close();
        fi.close();
        fo.close();
    }
    public static void fillGreencolor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rownum);
        cell =row.getCell(colnum);

        style =wb.createCellStyle();

        style.setFillBackgroundColor(IndexedColors.GREEN.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        fo = new FileOutputStream(xlfile);
        wb.write(fo);
        wb.close();
        fi.close();
        fo.close();
    }
    public static void fillRedcolor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
        fi = new FileInputStream(xlfile);
        wb = new XSSFWorkbook(fi);
        ws = wb.getSheet(xlsheet);
        row = ws.getRow(rownum);
        cell =row.getCell(colnum);

        style =wb.createCellStyle();
        style.setFillBackgroundColor(IndexedColors.RED.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

        cell.setCellStyle(style);
        fo = new FileOutputStream(xlfile);
        wb.write(fo);
        wb.close();
        fi.close();
        fo.close();

    }

    }



