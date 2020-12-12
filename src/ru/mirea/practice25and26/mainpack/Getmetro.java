package mainpack;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
    public void r() throws IOException {
        Gson gson = new GsonBuilder().create();
        JsonReader rd = new JsonReader(new FileReader("~/"));
        r.setLenient(true);
        r.beginObject();
        r.nextName();
        r.beginObject();
        int c=0;
        int k=1;
        while (r.hasNext()) {
            String name = rd.nextName();
            r.beginArray();
            String f=r.nextString();
            String l=r.nextString();
            if(l.equals("D1")){
                System.out.println("На ветке "+k+"  "+c+" станций");
                r.nextNull();
                r.endArray();
                break;
            }
            if(l.equals(String.valueOf(k)))
                c++;
            else {
                if (k!=13) {
                    System.out.println("На ветке " + k + "  " + c + " станций");
                    k++;
                    c = 1;
                }
                else {

                    k++;
                    c = 2;
                }
            }
            r.nextNull();
            r.endArray();
        }
        k=1;
        c=1;
        while (r.hasNext()){
            String name = r.nextName();
            r.beginArray();
            r.nextString();
            String l=r.nextString();
            if(l.equals("8A")){
                System.out.println("На ветке D" + k + "  " + c + " станций");
                r.nextNull();
                r.endArray();
                break;
            }
            if(l.equals("D"+String.valueOf(k)))
                c++;
            else {
                System.out.println("На ветке D" + k + "  " + c + " станций");
                k++;
                c=1;
            }
            r.nextNull();
            r.endArray();
        }

        c=1;
        while (r.peek() == JsonToken.NAME){
            String name = r.nextName();
            r.beginArray();
            r.nextString();
            String l=r.nextString();
            if(l.equals("8A"))
                c++;
            r.nextNull();
            r.endArray();
        }
        System.out.println("На ветке 8A" +  "  " + c + " станций");
        r.close();
    }
public class G {
    public G() throws IOException {
        ln();
    }

    private Document g() throws IOException {
        return (Jsoup.connect(" https://www.moscowmap.ru/metro.html#lines").get());
    }

    public void r() throws IOException {
        Gson gson = new GsonBuilder().create();
        JsonReader rd = new JsonReader(new FileReader("~/"));
        r.setLenient(true);
        r.beginObject();
        r.nextName();
        r.beginObject();
        int c=0;
        int k=1;
        while (r.hasNext()) {
            String name = rd.nextName();
            r.beginArray();
            String f=r.nextString();
            String l=r.nextString();
            if(l.equals("D1")){
                System.out.println("На ветке "+k+"  "+c+" станций");
                r.nextNull();
                r.endArray();
                break;
            }
            if(l.equals(String.valueOf(k)))
                c++;
            else {
                if (k!=13) {
                    System.out.println("На ветке " + k + "  " + c + " станций");
                    k++;
                    c = 1;
                }
                else {

                    k++;
                    c = 2;
                }
            }
            r.nextNull();
            r.endArray();
        }
        k=1;
        c=1;
        while (r.hasNext()){
            String name = r.nextName();
            r.beginArray();
            r.nextString();
            String l=r.nextString();
            if(l.equals("8A")){
                System.out.println("На ветке D" + k + "  " + c + " станций");
                r.nextNull();
                r.endArray();
                break;
            }
            if(l.equals("D"+String.valueOf(k)))
                c++;
            else {
                System.out.println("На ветке D" + k + "  " + c + " станций");
                k++;
                c=1;
            }
            r.nextNull();
            r.endArray();
        }

        c=1;
        while (r.peek() == JsonToken.NAME){
            String name = r.nextName();
            r.beginArray();
            r.nextString();
            String l=r.nextString();
            if(l.equals("8A"))
                c++;
            r.nextNull();
            r.endArray();
        }
        System.out.println("На ветке 8A" +  "  " + c + " станций");
        r.close();
    }

    private void ln() throws IOException {
        int k=1;
        String l="\"l\" : [ \n ";
        String stt ="\"stt\" : { \n ";
        Document doc = getpage();
        for (int i = 1; i <= 15; i++) {
            Elements lnk = doc.select("[data-line=\""+i+"\"]");
            lnk = lnk.select("span");
            String pConcatenated = "";
            Pattern pattern1 = Pattern.compile("\\d+");
            Matcher matcher;
            for (Element x : lnk) {
                matcher = pattern1.matcher(x.text());
                if (matcher.find())
                    pConcatenated = pConcatenated + x.text();
                else
                    pConcatenated = pConcatenated + x.text() + " ";
            }
            patt = Pattern.compile("([а-яА-Я]+.[а-яА-Я]+[' '][а-яА-Я]*)");
            Matcher matchcer = pattern1.matcher(pConcatenated);
            if (matchcer.find()) {
                lns= lns+"{\n"+"\"number\" : "+ i +",\n\"name\" : \""+ matchcer.group() + "\"\n},\n";
                pConcatenated=matchcer.replaceFirst("");
            }
            patt = Pattern.compile("\\d+.[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
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
            Elements lnk = doc.select("[data-line=\""+"D"+i+"\"]");
            lnk = lnk.select("span");
            String pConcatenated = "";
            Pattern patt = Pattern.compile("\\d+");
            Matcher matcher;
            for (Element x : lnk) {
                matcher = patt.matcher(x.text());
                if (matcher.find())
                    pConcatenated = pConcatenated + x.text();
                else
                    pConcatenated = pConcatenated + x.text() + " ";
            }
            patt = Pattern.compile("([М][Ц][Д].[1,2])");
            Matcher matchcer = patt.matcher(pConcatenated);
            if (matchcer.find()) {
                lns = lns+"{\n"+"\"number\" : "+"D"+ i +",\n\"name\" : \""+ matchcer.group() + "\"\n},\n";
            }
            patt = Pattern.compile("\\d+.[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
            matchcer = patt.matcher(pConcatenated);

            while (matchcer.find())
            {
                pConcatenated=matchcer.replaceFirst("");
                String a=matchcer.group();
                Pattern pattern2 = Pattern.compile("[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
                matchcer = pattern2.matcher(a);
                if(matchcer.find())
                    a=matchcer.group();
                stt=stt+"\""+k+"\" : ["+"\n\""+a+ "\",\n"+"\"D"+i+"\",\n],\n";
                matchcer = patt.matcher(pConcatenated);
                k++;
            }
        }
        k=1;
        Elements lnk = doc.select("[data-line=\"11A\"]");
        lnk = lnk.select("span");
        String pConcatenated = "";
        Pattern patt = Pattern.compile("\\d+");
        Matcher matcher;
        for (Element x : lnk) {
            matcher = patt.matcher(x.text());
            if (matcher.find())
                pConcatenated = pConcatenated + x.text();
            else
                pConcatenated = pConcatenated + x.text() + " ";
        }
        patt = Pattern.compile("([а-яА-Я]+.[а-яА-Я]+[' '][а-яА-Я]*)");
        Matcher matchcer = patt.matcher(pConcatenated);
        if (matchcer.find()) {
            lns= lns+"{\n"+"\"number\" : "+ "11A" +",\n\"name\" : \""+ matchcer.group() + "\"\n}\n";
        }patt = Pattern.compile("\\d+.[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
        matchcer = patt.matcher(pConcatenated);
        while (matchcer.find())
        {
            pConcatenated=matchcer.replaceFirst("");
            String a=matchcer.group();
            Pattern pattern2 = Pattern.compile("[а-яА-Я]+.[а-яА-Я]*\\s?[а-яА-Я]*");
            matchcer = pattern2.matcher(a);
            if(matchcer.find())
                a=matchcer.group();
            if(k!=3)
            stt=stt+"\""+k+"\" : ["+"\n\""+a+ "\",\n"+"\""+"11А"+"\",\n],\n";
            else
                stt=stt+"\""+k+"\" : ["+"\n\""+a+ "\",\n"+"\""+"11А"+"\",\n]\n";
            matchcer = patt.matcher(pConcatenated);
            k++;
        }
        lns=lns+"\n]";
        stt=stt+"\n}";
        FileWriter wr = new FileWriter(("~/"));
        wr.write("{\n");
        wr.write(stt);
        wr.write("\n");
        wr.write(lns);
        wr.write("\n}");
        wr.close();
        r();
    }
}