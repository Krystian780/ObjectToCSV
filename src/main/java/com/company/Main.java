package com.company;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args)  {
        try{
            ExcelWriter excelWriter = new ExcelWriter();
            excelWriter.injectEachObjectsPropertiesIntoACertainConsecutiveRow(getListOfCompaniesWithQuarterRevenue());
        }
        catch (FileNotFoundException x){
            System.out.println("FIle could not be found");
        }
    }

    public static Map<String, List<Integer>> getListOfCompaniesWithQuarterRevenue(){
        Map<String, List<Integer>> companies = new HashMap<>();
        List<Integer> revenue = new ArrayList<>();
        revenue.add(50);
        revenue.add(100);
        revenue.add(150);

        companies.put("Google" , revenue);
        companies.put("Facebook", revenue);
        companies.put("Tesla", revenue);
        companies.put("McDonald", revenue);
        companies.put("Auchan", revenue);
        return companies;
    }

}