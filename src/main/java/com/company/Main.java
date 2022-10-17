package com.company;

import java.io.FileNotFoundException;
import java.util.*;

public class Main {

    public static void main(String[] args)  {
       startTheProgramme();
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

    public static void startTheProgramme(){
        int x = 0;
        while(x<10){
            try{
                System.out.println("Please give file path");
                Scanner sc1 = new Scanner(System.in);
                String path = sc1.nextLine();
                ExcelWriter excelWriter = new ExcelWriter(path);
                excelWriter.injectEachObjectsPropertiesIntoACertainConsecutiveRow(getListOfCompaniesWithQuarterRevenue());
                break;
            }
            catch (FileNotFoundException e){
                System.out.println("FIle could not be found, create correct excel file on Desktop called Student Data");
                System.out.println("you have " + ++x + "more changes");
            }
        }
    }

}