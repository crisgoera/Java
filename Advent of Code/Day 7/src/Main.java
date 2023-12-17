import java.lang.reflect.Array;
import java.util.*;
import java.io.*;
import org.jsoup.*;
import org.jsoup.nodes.*;

public class Main {
    public static void main(String[] args) throws IOException {
        printParsedData();

        printHandList();
    }

    public static String[] parser() throws IOException {
        File file = new File("resources/testInput.html");
        Document doc = Jsoup.parse(file);
        return doc.body().text().split(" ");
    }

    public static ArrayList<Hand> getHandList() throws IOException {
        String[] parsedText = parser();
        ArrayList<Hand> handList = new ArrayList<>();

        for (int i = 0; i<parsedText.length; i=i+2){
            String cardInfo = parsedText[i];
            int bidInfo = Integer.parseInt(parsedText[i+1]);
            Hand newHand = new Hand();

            newHand.generate(cardInfo, bidInfo);
            handList.add(newHand);
        }

        return handList;
    }

    public static void printParsedData() throws IOException {
        String[] text = parser();

        for (String entry : text){
            System.out.print(entry + "\n");
        }
    }

    public static void printHandList() throws IOException {
        ArrayList<Hand> handList = getHandList();
        for (Hand entry : handList) {
            System.out.print(entry.cards + " ");
            System.out.print(entry.bid +"\n");
        }
    }
}