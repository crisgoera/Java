import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(sumOf(userInput()));
    }

//    Write a method that computes the sum of the integers between a min value and a max value (min and max included)
    public static int sumOf(int[] values) {
        int minValue = values[0];
        int maxValue = values[1];
        int sum=0;

        for (int i=minValue; i<=maxValue; i++) {
            sum = sum+i;
        }
        return sum;
    }

//    User input for min and max values.
    public static int[] userInput() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input min value");
        int minValue = sc.nextInt();

        System.out.println("Input max value");
        int maxValue = sc.nextInt();

        int[] values = {minValue, maxValue};
        return values;
    }
}