import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print(totalSum());
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

    public static int totalSum() throws IOException {
        ArrayList<Row> rowList = parser();
        int numValue = 0;

        for (int i=0; i<rowList.size(); i++){
            ArrayList<Integer> rowIndexes = rowList.get(i).getIndexes();
            for (int index : rowIndexes){
                numValue = numValue + rowList.get(i-1).getValue(index) + rowList.get(i).getValue(index)
                    + rowList.get(i+1).getValue(index);
            }
        }

        return numValue;
    }

//    Prints parsed input for test purposes.
    private static void printParsedData() throws IOException {
        for (Row entry : parser()){
            String data = entry.rowData;
            System.out.println(data);
        }

        System.out.print(parser().size());
    }
}