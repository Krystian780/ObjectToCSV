package com.company;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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

    public void writeListToAnExcelFile(HashMap<Integer, List<Integer>> companies) throws IOException {
        int rowId = 0;
        for(int x = 0; x < listOfSOmething.size(); x++){
            Row row = spreadsheet.createRow(rowId++);
            Cell cell = row.createCell(0);
            cell.setCellValue(listOfSOmething.get(x));
       }
       workbook.write(excelFile.getExcelFile());
    }
}
