import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String cardInfo = "Card   1: 82 15 37 75 85 51 99 18 17  2 |  8 17 54 14 18 99  4 85 51 49 91 15 82 24 75 25 69 61 52 58 37 87  2 22 28\n";
        Card testCard = new Card();

        cardInfo = cardInfo.replaceAll("\\s{2,}", " ");
        System.out.print(cardInfo);

        testCard.constructor(cardInfo);
        System.out.print(testCard.winningNumbers);
        System.out.print(testCard.cardNumbers);
    }

    public static ArrayList<Card> parser() throws IOException {
        File file = new File("resources/input.html");
        Document doc = Jsoup.parse(file, "UTF-8");
        String[] cardList = doc.body().text().split("Card");
        ArrayList<Card> cardArray = new ArrayList<>();

        for (String cardInfo : cardList){
            Card newCard = new Card();
            newCard.constructor(cardInfo);

            cardArray.add(newCard);
        }

        return cardArray;
    }


    //    Prints parsed input for test purposes.
    private static void printParsedData() throws IOException {
        for ( Card entry : parser()){
            System.out.print(entry + "\n");
        }

        System.out.print(parser().size());
    }
}