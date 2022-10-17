package com.company;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class ExcelWriter {
    private final ExcelFile excelFile;
    private final XSSFWorkbook workbook;
    private final XSSFSheet spreadsheet;
    private XSSFRow row;

    public ExcelWriter() throws FileNotFoundException {
        excelFile = new ExcelFile();
        workbook = new XSSFWorkbook();
        spreadsheet = workbook.createSheet("Student Data");
    }

    public void createHeader(){
        List<String> headers = new Header().getHeaderNames();
        row = spreadsheet.createRow(0);
        int cellId = 0;
        for (String obj : headers) {
            Cell cell = row.createCell(cellId++);
            cell.setCellValue(obj);
        }
    }

    public void injectEachObjectsPropertiesIntoACertainConsecutiveRow(Map<String, List<Integer>> companies)  {
        int rowId = 1;
        Set<String> allKeysFromMap = companies.keySet();
        createHeader();
        for (String key : allKeysFromMap) {
            row = spreadsheet.createRow(rowId++);
            row.createCell(0).setCellValue(key);
            int cellid = 1;
            for (Integer obj : companies.get(key)) {
                Cell cellOfTheCurrentRow = row.createCell(cellid++);
                cellOfTheCurrentRow.setCellValue(obj);
            }
        }
       try {
           workbook.write(excelFile.getExcelFile());
       }catch (IOException e){
           System.out.println("Give correct path");
       }
    }
}
