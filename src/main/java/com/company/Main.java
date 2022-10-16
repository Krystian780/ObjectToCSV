package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        Map<String, List<Integer>> companies = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(100);
        list.add(150);

        companies.put("Google" , list);
        companies.put("Facebook", list);
        companies.put("Tesla", list);
        companies.put("McDonald", list);
        companies.put("Auchan", list);
        ExcelWriter excelWriter = new ExcelWriter();
        excelWriter.writeListToAnExcelFile(companies);
    }

}