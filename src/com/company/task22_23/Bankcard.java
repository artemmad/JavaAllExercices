package com.company.task22_23;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bankcard {
    private String doc="";
    public void Readingfile(){
        try (CSVReader csvReader = new CSVReader(new FileReader("D:/java projects/alltasks/src/com/company/task22_23/movementList.csv"));) {
            String[]values = null;
            while ((values = csvReader.readNext()) != null) {
                doc=doc+values;
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(doc);
    }
}
