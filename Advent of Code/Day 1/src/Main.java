import java.util.*;
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> inputList = scraper();
        int totalSum = 0;

        for (int i=0;i<inputList.size();i++){
            totalSum = totalSum + calibrationValue(inputList.get(i));
        }

        System.out.print(totalSum);
    }

//  Scrape html file. "https://adventofcode.com/2023/day/1/input"
    public static ArrayList<String> scraper() throws IOException {
        ArrayList<String> resultList = new ArrayList<String >();
//        Loads html file
        File file = new File("resources/input.html");

//        Parses file into doc object.
        Document doc = Jsoup.parse(file, "UTF-8");

//        Extracts text from body.
        String htmlBody = doc.body().text();

//        Splits text into words and returns them as an ArrayList.
        String[] inputArray = htmlBody.split(" ");
        resultList.addAll(Arrays.asList(inputArray));
        return resultList;
    }

//  Extract all calibration digits from a string.
    public static int calibrationValue(String string){
//        Separates string into an array of characters.
        char[] charArray = string.toCharArray();
        ArrayList<String> digits = new ArrayList<String>();

        for (int i=0; i< charArray.length; i++){
            int numValue = Character.getNumericValue(charArray[i]); //If char is a number it will return value (0..9)
            if (numValue <= 9){
                digits.add(Character.toString(charArray[i]));
            }
        }
        return Integer.parseInt(digits.get(0) + digits.get(digits.size()-1));
    }
}