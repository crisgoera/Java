import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        printParsedData();
    }

    public static HashMap<String, String> parser() throws IOException {
        File file = new File("resources/testInput.html");
        Document doc = Jsoup.parse(file);
        String[] parsedText = doc.body().text().split(":");

        
        return parsedInfo;
    }

    public static void printParsedData() throws IOException {
        System.out.println(parser());
    }
}