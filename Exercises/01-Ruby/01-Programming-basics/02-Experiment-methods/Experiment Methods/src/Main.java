import java.util.*;

public class Main {
    public static void main(String[] args) {
        String newLine = "\n";

        System.out.println(removeWhitespaces("     Hello World     ") + newLine);

        System.out.println(belongsTo("Hello World", "World") + newLine);
        System.out.println(belongsTo("Hello World", "Excuse") + newLine);

        System.out.print(replaceCharacter("Hello World", "o", "$") + newLine);

        System.out.print(exactDivision(12, 6)+ newLine);
        System.out.print(exactDivision(12,5) + newLine);

        System.out.print(divisibleBy(12) + newLine);
        System.out.print(divisibleBy(7) + newLine);

        String[] array = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(randomSubset(generateArrayList(array), 3) + newLine);
    }

//    TODO: return a copy of the string with leading and trailing whitespaces remove
//     example: get_rid_of_surrounding_whitespaces("  hey yo  ") => "hey yo"

    public static String removeWhitespaces(String a_string) {
        return a_string.strip();
    }

//    TODO: return true if a_string contains a_word
//     example: belongs_to?("hey jude", "jude") => true

    public static boolean belongsTo(String a_string, String a_word) {
        return a_string.contains(a_word);
    }

//    TODO: return a copy of the string with the new letter replacing the old one
//     # example: replace("casanova", "a", "o") => "cosonovo"

    public static String replaceCharacter(String a_string, String old_letter, String new_letter) {
        return a_string.replace(old_letter, new_letter);
    }

//    TODO: return division of an_integer by a_divider (computing the floating division, NOT the euclidean one)
//     # example: exactly_divide(13, 4) => 3.25

    public static float exactDivision(int dividend, int divisor) {
        return (float)dividend/divisor;
    }

//    TODO: return true if an_integer is divisible by 2
//     # example: divisible_by_two?(6) => true

    public static boolean divisibleBy(int dividend) {
        if (dividend % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

//    TODO: return a random subset of an_array with size sample_size
//     # example: random_subset(("a".."z").to_a, 4) => ["u", "q", "l", "t"]

    public static ArrayList<String> randomSubset(ArrayList<String> an_array, int sample_size) {
        ArrayList<String> result = new ArrayList<String>();

        for (int i=0; i<sample_size; i++) {
            Random generator = new Random();
            int randomIndex = generator.nextInt(an_array.size());
            result.add(an_array.get(randomIndex));
        }
        return result;
    }

    public static ArrayList<String> generateArrayList(String[] array) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String element : array) {
            arrayList.add(element);
        }
        return arrayList;
    }
}