import org.jsoup.*;
import org.jsoup.nodes.*;
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        printParsedData();
        System.out.print(mapSeeds());
        int[] intArray = mapSeedToSoil().get(0);
        for (int integer : intArray){
            System.out.print(integer + "\n");
        }
    }

    public static String[] parser() throws IOException {
        File file = new File("resources/testInput.html");
        Document doc = Jsoup.parse(file);
        return doc.body().text().split(":");
    }

    public static ArrayList<Integer> mapSeeds() throws IOException {
        ArrayList<Integer> seedMapping = new ArrayList<>();
        String parsedSeeds = parser()[1].split("seed-")[0].trim();

        for (String seedNumber : parsedSeeds.split(" ")) {
            seedMapping.add(Integer.parseInt(seedNumber));
        }

        return seedMapping;
    }

    static ArrayList<int[]> mapSeedToSoil() throws IOException {
        ArrayList<int[]> seedToSoilMapping = new ArrayList<>();
        String parsedSeedToSoil = parser()[2].split("soil-")[0].trim();
        int i = 0;
        int[] individualArray = new int[3];

        for (String seedToSoilNumber : parsedSeedToSoil.split(" ")) {
            individualArray[i] = Integer.parseInt(seedToSoilNumber);
            i++;
            if (i==2){
                seedToSoilMapping.add(individualArray);
                i = 0;
            }
        }

        return seedToSoilMapping;
    }

    public static void printParsedData() throws IOException {
        for (String entry : parser()) {
            System.out.print(entry + "\n");
        }
    }
}