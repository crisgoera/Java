import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(Integer.valueOf('.'));
        int[] symbolPool = {0,1,2,3,4,5,6,7,8,9, Integer.valueOf('.')};
    }

//    Loads and parses input puzzle from html file. Returns ArrayList containing Object Row with the line data.
    public static ArrayList<Row> parser() throws IOException {
        File file = new File("resources/input.html");
        Document doc = Jsoup.parse(file, "UTF-8");
        String[] text = doc.body().text().split(" ");
        ArrayList<Row> ret = new ArrayList<Row>();

        for (String entry : text){
            Row row = new Row();
            row.generate(entry);
            ret.add(row);
        }

        return ret;
    }

    private static void printParsedData() throws IOException {
        for (Row entry : parser()){
            String data = entry.rowData;
            System.out.println(data);
        }

        System.out.print(parser().size());
    }
}