import java.io.*;
import java.util.*;
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        subsets("97: 3 green, 7 red; 2 red, 3 green, 1 blue; 4 green, 1 blue, 4 red");
    }

//    Load and parse resource hmtl file.
    public static String[] scraper() throws IOException {
        File file = new File("resources/input.html");
        Document doc = Jsoup.parse(file, "UTF-8");
        return doc.body().text().split("Game");
    }

//    Data structuring. Separates id and result subsets.
    public static void subsets(String game){
        int id = Integer.parseInt(game.split(":")[0]);
        String dataset = game.split(":")[1];
        String subset1 = dataset.split(";")[0];
        String subset2 = dataset.split(";")[1];
        String subset3 = dataset.split(";")[2];
    }





    public static void printInputData() throws IOException {
        String[] text = scraper();
        for (int i=0; i<text.length;i++){
            System.out.println(text[i] + "\n");
        }
        System.out.println(text.length);
    }
}