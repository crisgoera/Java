import java.util.*;

public class Main {
    public static void main(String[] args) {
    }

    public static char[] inputNumber() {
        System.out.println("Introduce you number: \n");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        char[] digitArray = input.toCharArray();
        return digitArray;
    }

    public static ArrayList<Integer> separateDigits(char[] input) {
        ArrayList<Integer> resultArray = new ArrayList<Integer>();

        for (int i=0; i<input.length; i++) {
            resultArray.add(Character.getNumericValue(input[i]));
        }

        resultArray.add(resultArray.get(0)*resultArray.get(1));
        resultArray.add(resultArray.get(1)*resultArray.get(2));
        return resultArray;
    }

    public static boolean colorful(ArrayList<Integer> input) {
        for (int i=0; i<input.size(); i++) {
            if (input.get(i)==)
        }
    }

}