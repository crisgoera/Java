import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Row> parsedData = parser();
        Row charArray = parsedData.get(1);
        System.out.print(charArray.rowData);
        System.out.print(charArray.getIndexes());
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