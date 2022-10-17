package com.company;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExcelFile {
    private FileOutputStream excelFile;

    public ExcelFile(String path) throws FileNotFoundException {
        excelFile = new FileOutputStream(path);
    }

    public FileOutputStream getExcelFile() {
        return excelFile;
    }

}
