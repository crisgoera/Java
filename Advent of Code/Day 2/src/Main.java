import java.io.*;
import java.util.*;
import org.jsoup.*;
import org.jsoup.nodes.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) throws IOException {
        String[] inputText = scraper();
        printInputData();

        int idSum = 0;

        for(int i=1; i<inputText.length; i++) {
            Game game = datasets(inputText[i]);
            if (game.validity()) {
                idSum = idSum + game.gameId;
            }
        }

        System.out.println(idSum);
    }

//    Load and parse resource hmtl file.
    public static String[] scraper() throws IOException {
        File file = new File("resources/input.html");
        Document doc = Jsoup.parse(file, "UTF-8");
        return doc.body().text().split("Game");
    }

//    Data structuring. Separates id and result subsets.
    public static Game datasets(String game){
//        Separates Id from dataset.
        int id = Integer.parseInt(game.split(":")[0]);  // {id, dataset}
        String dataset = game.split(":")[1];

//        Divides dataset into sets.
        String set1 = dataset.split(";")[0];   // { set1, set2, set3}
        String set2 = dataset.split(";")[1];
        String set3 = dataset.split(";")[2];

        int[] set1Data = extractCubeNumbers(set1);  // {[red, blue, green], [red, blue, green]. [red, blue, green]}
        int[] set2Data = extractCubeNumbers(set2);
        int[] set3Data = extractCubeNumbers(set3);

        Game gameData = new Game();
        gameData.constructor(id, set1Data, set2Data, set3Data);

        return gameData; // {id, [red, blue, green], [red, blue, green]. [red, blue, green]}
    }


    public static int[] extractCubeNumbers(String set){
        int[] cubes = {redCubes(set), blueCubes(set),greenCubes(set)};
        return cubes; // {[red, blue, green]}
    }


//  Extracts the red cube number from a set.
    public static int redCubes(String set){
        String[] subset = set.split(",");
        int redCubes = 0;
        for (int i=0;i< subset.length;i++){
            if (subset[i].contains("red")){
                String number = subset[i].split("red")[0]; // Output: "  7  ". Need to remove spaces.
                redCubes = redCubes + Integer.parseInt(number.replaceAll("\\s", ""));
            }
        }
        return redCubes;
    }


//    Extracts the blue cube number from a set.
    public static int blueCubes(String set){
        String[] subset = set.split(",");
        int blueCubes = 0;
        for (int i=0;i< subset.length;i++){
            if (subset[i].contains("blue")){
                String number = subset[i].split("blue")[0]; // Output: "  7  ". Need to remove spaces.
                blueCubes = blueCubes + Integer.parseInt(number.replaceAll("\\s", ""));
            }
        }
        return blueCubes;
    }

//    Extracts the green cube number from a set.
    public static int greenCubes(String set){
        String[] subset = set.split(",");
        int greenCubes = 0;
        for (int i=0;i< subset.length;i++){
            if (subset[i].contains("green")){
                String number = subset[i].split("green")[0]; // Output: "  7  ". Need to remove spaces.
                greenCubes = greenCubes + Integer.parseInt(number.replaceAll("\\s", ""));
            }
        }
        return greenCubes;
    }


    public static void printInputData() throws IOException {
        String[] text = scraper();
        for (int i=1; i<text.length;i++){
            System.out.println(text[i] + "\n");
        }
        System.out.println(text.length);
    }

    public static void printData(int[] data){
        for (int i=0;i<data.length; i++){
            System.out.print(data[i] + "\n");
        }
    }
}