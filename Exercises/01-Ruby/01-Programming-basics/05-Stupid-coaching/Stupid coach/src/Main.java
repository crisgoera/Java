import java.util.*;

public class Main {
    public static void main(String[] args) {
        String userPrompt = userPrompt();
        while (!breakCondition(userPrompt)) {
            System.out.println(evaluatePrompt(userPrompt));
            userPrompt=userPrompt();
        }
    }

    public static String userPrompt() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Talk with your coach:");
        String userPrompt = sc.nextLine();
        return userPrompt;
    }

    public static String evaluatePrompt(String input) {
        if (input.charAt(input.length() - 1) == '?') {
            String coachResponse = "Silly question, get dressed and go to work! \n";
            return coachResponse;
        } else {
            String coachResponse = "I don't care, get dressed and go to work! \n";
            return coachResponse;
        }
    }

    public static boolean breakCondition(String input) {
        String breakString = "I am going to work right now!";
        if (input.compareTo(breakString)==0) {
            return true;
        } else {
            return false;
        }
    }
}