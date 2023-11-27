import java.util.*;

public class Main {
    public static void main(String[] args) {
        int bankScore = pickBankScore();
        int playerScore = randomCard();
        System.out.println(gameState(bankScore, playerScore));
        String newCard = playerChoice();

        while (Objects.equals(newCard, "y") || Objects.equals(newCard, "yes")) {
            playerScore = playerScore + randomCard();
            System.out.println(gameState(bankScore, playerScore));
            newCard = playerChoice();
        }
        String result = gameResult(bankScore, playerScore);
        System.out.println(result);
    }

//    Generates random score between 16 and 21.
    public static int pickBankScore() {
        Random random = new Random();
        return random.nextInt(16, 22);
    }

//    Generates random card between 1 and 11.
    public static int randomCard() {
        Random random = new Random();
        return random.nextInt(1, 12);
    }

//    Generates message with bank and player scores.
    public static String gameState(int bankScore, int playerScore) {
        return "The bank score is " + bankScore + "\n The player score is " + playerScore + "\n";
    }

//    Determines game result based on bank and player scores.
    public static String gameResult(int bankScore, int playerScore) {
        if (playerScore==21) {
            return "Blackjack! You win \n";
        } else if (playerScore==bankScore) {
            return "Draw! \n";
        } else if (playerScore < 21 & playerScore > bankScore) {
            return "You win! \n";
        } else {
            return "You lose! \n";
        }
    }

//    Retrieves player choice of picking another card.
    public static String playerChoice(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Card? 'y' or 'yes' to get a new card");
        return sc.next();
    }
}