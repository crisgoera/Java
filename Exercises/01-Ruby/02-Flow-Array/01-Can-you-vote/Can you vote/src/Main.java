import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(canVote(userInput()));
    }

//    Age input by user
    public static int userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: \n");
        int age = sc.nextInt();
        return age;
    }

//    Evaluate age
    public static String canVote(int age) {
        if (age < 18) {
            return "You can not vote \n";
        }else{
            return "You can vote \n";
        }
    }
}