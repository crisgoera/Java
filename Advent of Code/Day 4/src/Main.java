import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        int pointSum = 0;
        ArrayList<Card> cardList = parser();

        for (Card entry : cardList){
            pointSum = pointSum + entry.points();
        }

        System.out.print(pointSum);
    }

    public static ArrayList<Card> parser() throws IOException {
        File file = new File("resources/input.html");
        Document doc = Jsoup.parse(file, "UTF-8");
        String[] cardList = doc.body().text().split("Card");
        ArrayList<Card> cardArray = new ArrayList<>();

        for (int i=1; i<cardList.length; i++){
            Card newCard = new Card();
            newCard.constructor(cardList[i]);
            cardArray.add(newCard);
        }

        return cardArray;
    }


//        Prints parsed input for test purposes.
    private static void printParsedData() throws IOException {
        for ( Card entry : parser()){
            System.out.print(entry.winningNumbers);
            System.out.print(entry.cardNumbers + "\n");
        }
    }
}