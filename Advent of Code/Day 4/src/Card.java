import java.util.*;

public class Card {
    ArrayList<Integer> winningNumbers;
    ArrayList<Integer> cardNumbers;


    public void constructor(String cardInfo){
//        Replaces 2 consecutive spaces with one to avoid problems whn splitting the info.
        cardInfo = cardInfo.replaceAll("\\s{2,}", " ");

        String relevantNumbers = cardInfo.split(":")[1];

        String[] winningNumbersString = relevantNumbers.split("\\|")[0].trim().split(" ");
        ArrayList<Integer> winningArray = new ArrayList<>();
        for (String numberString : winningNumbersString){
            winningArray.add(Integer.parseInt(numberString));
        }

        String[] cardNumbersString = relevantNumbers.split("\\|")[1].trim().split(" ");
        ArrayList<Integer> cardArray = new ArrayList<>();
        for (String numberString : cardNumbersString){
            cardArray.add(Integer.parseInt(numberString));
        }

        winningNumbers = winningArray;
        cardNumbers = cardArray;
    }
}
