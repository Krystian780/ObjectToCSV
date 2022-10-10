package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExcelFile {
    FileOutputStream excelFile;

    public ExcelFile() throws FileNotFoundException {
        excelFile = new FileOutputStream("C:\\Users\\Krystian\\Desktop\\folder\\excel.xlsx");
    }

    public FileOutputStream getExcelFile() {
        return excelFile;
    }

    public void setExcelFile(FileOutputStream excelFile) {
        this.excelFile = excelFile;
    }

}
