public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
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

    public static String replaceCharacter(String a_string, char old_letter, char new_letter) {
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


}