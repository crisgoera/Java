import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> array = separateDigits(inputNumber());
        boolean state = true;
        for (int i=0; i<array.size(); i++) {
            int count = count(array, array.get(i));
            if (count>0) {
                state = false;
                break;
            }
        }
        System.out.print(state);
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

    public static int count(ArrayList<Integer> array, int entry) {
        int count=0;
        for (int i=0; i<array.size(); i++) {
            if (array.get(i)==entry) {
                count++;
            }
        }
        return count-1;
    }
}