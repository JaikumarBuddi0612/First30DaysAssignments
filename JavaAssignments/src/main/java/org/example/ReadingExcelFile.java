package org.example;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadingExcelFile {
    public void updateCellValue(int row,int col,String fileName,Object value) throws IOException {
        FileInputStream file = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(1);
        if(row>sheet.getLastRowNum()){
            System.out.println("There is no such row exists");
            return;
        }
        Row r = sheet.getRow(row);
        if(col>r.getLastCellNum()){
            System.out.println("There is no such column exists");
            return;
        }
        Cell c =r.getCell(col);
        if(c.getCellType()==CellType.STRING){
            c.setCellValue(value.toString());
            System.out.println(c.getStringCellValue());
        }
        else if(c.getCellType()==CellType.NUMERIC){
            c.setCellValue(Double.parseDouble((String) value));
            System.out.println(c.getNumericCellValue());
        }
    }
    public void readCellValue(int row,int col,String fileName) throws IOException {
        FileInputStream file = new FileInputStream(fileName);
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheetAt(1);
        if(row>sheet.getLastRowNum()){
            System.out.println("There is no such row exists");
            return;
        }
        Row r = sheet.getRow(row);
        if(col>r.getLastCellNum()){
            System.out.println("There is no such column exists");
            return;
        }
        Cell c =r.getCell(col);
        if(c.getCellType()==CellType.STRING){
            System.out.println(c.getStringCellValue());
        }
        else if(c.getCellType()==CellType.NUMERIC){
            System.out.println(c.getNumericCellValue());
        }
    }
    public static void updatesExcel(String name,String feild,String value){
        try {
            FileInputStream file= new FileInputStream("/Users/JaiBuddi/Downloads/Technical Assignment.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            Sheet sheet =workbook.getSheetAt(1);
            sheet.forEach(row->{
                if(row.getCell(0).getStringCellValue().equals(name)){
                    row.getSheet().getRow(0).forEach(colName->{
                        if(colName.getStringCellValue().equals(feild)){
                            row.getCell(colName.getColumnIndex()).setCellValue(value);
                        }
                    });
                }
            });
            FileOutputStream out = new FileOutputStream("/Users/JaiBuddi/Downloads/Technical Assignment.xlsx");
            workbook.write(out);
            workbook.close();
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws IOException {
        updatesExcel("Emma","Mobile","1234567890");
    }
}
