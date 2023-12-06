import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        printData(parser());
    }

//    Loads and parses input puzzle from html file. Returns Text divided in equal sized lines.
    public static String[] parser() throws IOException {
        File file = new File("resources/input.html");
        Document doc = Jsoup.parse(file, "UTF-8");
        return doc.body().text().split(" ");
    }

    private static void printData(String[] data){
        for (String entry : data){
            System.out.println(entry);
        }
    }
}