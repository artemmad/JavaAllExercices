package com.company.task22_23;

import com.opencsv.CSVReader;
import com.opencsv.bean.ColumnPositionMappingStrategy;
import com.opencsv.bean.CsvToBean;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bankcard {
    List<Transaction> trans = new ArrayList<Transaction>();
    private CSVReader csvReader;
    private static final String path= "D:/java projects/alltasks/src/main/java/com/company/task22_23/movementList.csv";
    List<List<String>> records;
    public void Readingfile(){
        records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader(path));) {
            String[]values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (CsvValidationException e) {
            e.printStackTrace();
        }
        parsing();
    }

    private void parsing(){
        Pattern pattern1 = Pattern.compile("\\W{7}\\s\\W{4}");
        Pattern pattern2 = Pattern.compile("\\d{20}");
        Pattern pattern3 = Pattern.compile("[a-zA-Z]{3}[,]");
        Pattern pattern4 = Pattern.compile("[a-zA-Z]{3}[_]\\w{6}");
        Pattern pattern5 = Pattern.compile("(\\d{6,8}.\\w{3}.[a-zA-Z]{6}.{9,17})|(\\w{8}.\\w{3}.[a-zA-Z]{12}.{9,17})" +
                "|(\\d{6}\\s{1,4}.\\w{2}.\\w{9}.{9,19})|(\\d{8}.[USA].{22,28})");
        Pattern pattern6 = Pattern.compile("\\d+");
        Pattern pattern7 = Pattern.compile("[0][,].\\d+.\\d+.");

        for(List<String> word : records)
        {
            for (int i=0; i< word.size();i++) {
                Transaction transaction = new Transaction();
                Matcher matcher = pattern1.matcher(word.get(i));
                if (matcher.find())
                transaction.accountName=matcher.group();
                matcher=pattern2.matcher(word.get(i));
                if (matcher.find())
                    transaction.accountBic=matcher.group();
                matcher=pattern3.matcher(word.get(i));
                if (matcher.find()) {
                    String a=matcher.group();
                    String b=a.substring(0,3);
                        transaction.currency = b;
                }
                matcher=pattern4.matcher(word.get(i));
                if (matcher.find())
                    transaction.reference=matcher.group();
                matcher=pattern5.matcher(word.get(i));
                if (matcher.find())
                    transaction.info=matcher.group();
                matcher=pattern6.matcher(word.get(i));
                if (i>0) {
                    if (word.get(i - 1).equals("0"))
                        if (matcher.find())
                        transaction.amountminus= Double.parseDouble(matcher.group());
                }
                if (i<word.size()-1) {
                    if (word.get(i + 1).equals("0"))
                        if (matcher.find())
                            transaction.amountplus= Double.parseDouble(matcher.group());
                }
                matcher=pattern7.matcher(word.get(i));

                if (matcher.find()) {
                    String c=matcher.group();
                    double d=0;
                    if(c.substring(c.length() - 4, c.length() - 3).equals(",")) {
                        d = Double.parseDouble(c.substring(3, c.length() - 4));
                        d = d + ((Double.parseDouble(c.substring(c.length() - 3, c.length() - 1))) / 100);
                    }
                    else {
                        d = Double.parseDouble(c.substring(3, c.length() - 3));
                        d = d + ((Double.parseDouble(c.substring(c.length() - 2, c.length() - 1))) / 10);
                    }
                    transaction.amountminus= d;
                }
                trans.add(transaction);
            }

        }
        double calc1=0;
        double calc=0;
        for (Transaction t : trans){
            calc1=calc1+t.amountplus;
            calc=calc-t.amountminus;
        }

    System.out.println("Доходы:   "+calc1);
        System.out.println("Рассходы:   "+calc);
    }


}
