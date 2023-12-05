import java.io.*;
import java.util.*;
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] text = scraper();
        for (int i=0; i<text.length;i++){
            System.out.println(text[i] + "\n");
        }
        System.out.println(text.length);
    }

//    Load and parse resource hmtl file.
    public static String[] scraper() throws IOException {
        File file = new File("resources/input.html");
        Document doc = Jsoup.parse(file, "UTF-8");
        return doc.body().text().split("Game");
    }

}