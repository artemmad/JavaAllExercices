package com.company.task25_26;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import javax.naming.Name;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Getmetro {
    public Getmetro() throws IOException {
        lines();
    }

    private Document getpage() throws IOException {
        return (Jsoup.connect(" https://www.moscowmap.ru/metro.html#lines").get());
    }

    private void lines() throws IOException {
        int k=1;
        String lines ="\"lines\" : [ \n ";
        String stations ="\"stations\" : { \n ";
        Document doc = getpage();
        for (int i = 1; i <= 15; i++) {
            Elements link = doc.select("[data-line=\""+i+"\"]");
            link = link.select("span");
            String pConcatenated = "";
            Pattern pattern1 = Pattern.compile("\\d+");
            Matcher matcher;
            for (Element x : link) {
                matcher = pattern1.matcher(x.text());
                if (matcher.find())
                    pConcatenated = pConcatenated + x.text();
                else
                    pConcatenated = pConcatenated + x.text() + " ";
            }
            pattern1 = Pattern.compile("([а-яА-Я]+.[а-яА-Я]+[' '][а-яА-Я]*)");
            Matcher matchcer = pattern1.matcher(pConcatenated);
            if (matchcer.find()) {
                lines= lines+"{\n"+"\"number\" : "+ i +",\n\"name\" : \""+ matchcer.group() + "\"\n},\n";
                pConcatenated=matchcer.replaceFirst("");
            }
            pattern1 = Pattern.compile("\\d+.[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
            matchcer = pattern1.matcher(pConcatenated);

            while (matchcer.find())
            {
                pConcatenated=matchcer.replaceFirst("");
                String a=matchcer.group();
                Pattern pattern2 = Pattern.compile("[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
                matchcer = pattern2.matcher(a);
                if(matchcer.find())
                a=matchcer.group();
                stations=stations+"\""+k+"\" : ["+"\n\""+a+ "\",\n"+"\""+i+"\",\n],\n";
                matchcer = pattern1.matcher(pConcatenated);
                k++;
            }

        }
        for (int i = 1; i <= 2; i++) {
            Elements link = doc.select("[data-line=\""+"D"+i+"\"]");
            link = link.select("span");
            String pConcatenated = "";
            Pattern pattern1 = Pattern.compile("\\d+");
            Matcher matcher;
            for (Element x : link) {
                matcher = pattern1.matcher(x.text());
                if (matcher.find())
                    pConcatenated = pConcatenated + x.text();
                else
                    pConcatenated = pConcatenated + x.text() + " ";
            }
            pattern1 = Pattern.compile("([М][Ц][Д].[1,2])");
            Matcher matchcer = pattern1.matcher(pConcatenated);
            if (matchcer.find()) {
                lines= lines+"{\n"+"\"number\" : "+"D"+ i +",\n\"name\" : \""+ matchcer.group() + "\"\n},\n";
            }
            pattern1 = Pattern.compile("\\d+.[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
            matchcer = pattern1.matcher(pConcatenated);

            while (matchcer.find())
            {
                pConcatenated=matchcer.replaceFirst("");
                String a=matchcer.group();
                Pattern pattern2 = Pattern.compile("[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
                matchcer = pattern2.matcher(a);
                if(matchcer.find())
                    a=matchcer.group();
                stations=stations+"\""+k+"\" : ["+"\n\""+a+ "\",\n"+"\"D"+i+"\",\n],\n";
                matchcer = pattern1.matcher(pConcatenated);
                k++;
            }
        }
        k=1;
        Elements link = doc.select("[data-line=\"11A\"]");
        link = link.select("span");
        String pConcatenated = "";
        Pattern pattern1 = Pattern.compile("\\d+");
        Matcher matcher;
        for (Element x : link) {
            matcher = pattern1.matcher(x.text());
            if (matcher.find())
                pConcatenated = pConcatenated + x.text();
            else
                pConcatenated = pConcatenated + x.text() + " ";
        }
        pattern1 = Pattern.compile("([а-яА-Я]+.[а-яА-Я]+[' '][а-яА-Я]*)");
        Matcher matchcer = pattern1.matcher(pConcatenated);
        if (matchcer.find()) {
            lines= lines+"{\n"+"\"number\" : "+ "11A" +",\n\"name\" : \""+ matchcer.group() + "\"\n}\n";
        }pattern1 = Pattern.compile("\\d+.[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
        matchcer = pattern1.matcher(pConcatenated);
        while (matchcer.find())
        {
            pConcatenated=matchcer.replaceFirst("");
            String a=matchcer.group();
            Pattern pattern2 = Pattern.compile("[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
            matchcer = pattern2.matcher(a);
            if(matchcer.find())
                a=matchcer.group();
            if(k!=3)
            stations=stations+"\""+k+"\" : ["+"\n\""+a+ "\",\n"+"\""+"11А"+"\",\n],\n";
            else
                stations=stations+"\""+k+"\" : ["+"\n\""+a+ "\",\n"+"\""+"11А"+"\",\n]\n";
            matchcer = pattern1.matcher(pConcatenated);
            k++;
        }
        lines=lines+"\n]";
        stations=stations+"\n}";
        FileWriter writer = new FileWriter(("D:\\java projects\\alltasks\\src\\main\\java\\com\\company\\task25_26\\file.json"));
        writer.write("{\n");
        writer.write(stations);
        writer.write("\n");
        writer.write(lines);
        writer.write("\n}");
        writer.close();
        read();
    }
    public void read() throws IOException {
        Gson gson = new GsonBuilder().create();
        JsonReader reader = new JsonReader(new FileReader("D:\\java projects\\alltasks\\src\\main\\java\\com\\company\\task25_26\\file.json"));
        reader.setLenient(true);
        reader.beginObject();
        reader.nextName();
        reader.beginObject();
        int count=0;
        int k=1;
        while (reader.hasNext()) {
            String name = reader.nextName();
            reader.beginArray();
            String f=reader.nextString();
            String l=reader.nextString();
            if(l.equals("D1")){
                System.out.println("На ветке "+k+"  "+count+" станций");
                reader.nextNull();
                reader.endArray();
                break;
            }
            if(l.equals(String.valueOf(k)))
                count++;
            else {
                if (k!=13) {
                    System.out.println("На ветке " + k + "  " + count + " станций");
                    k++;
                    count = 1;
                }
                else {

                    k++;
                    count = 2;
                }
            }
            reader.nextNull();
            reader.endArray();
        }
        k=1;
        count=1;
        while (reader.hasNext()){
            String name = reader.nextName();
            reader.beginArray();
            reader.nextString();
            String l=reader.nextString();
            if(l.equals("11А")){
                System.out.println("На ветке D" + k + "  " + count + " станций");
                reader.nextNull();
                reader.endArray();
                break;
            }
            if(l.equals("D"+String.valueOf(k)))
                count++;
            else {
                System.out.println("На ветке D" + k + "  " + count + " станций");
                k++;
                count=1;
            }
            reader.nextNull();
            reader.endArray();
        }

        count=1;
        while (reader.peek() == JsonToken.NAME){
            String name = reader.nextName();
            reader.beginArray();
            reader.nextString();
            String l=reader.nextString();
            if(l.equals("11А"))
                count++;
            reader.nextNull();
            reader.endArray();
        }
        System.out.println("На ветке 11A" +  "  " + count + " станций");
        reader.close();
    }
}
