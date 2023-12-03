import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(generateHorseLineUp());
        printLineUp();
    }

//    Seed of the initial array.
    public static ArrayList<String> generateHorseLineUp(){
        String[] lineUp = {"Abricot du Laudot", "Black Caviar", "Brigadier Gerard"};
        ArrayList<String> horseList = new ArrayList<>();

        for (int i=0; i<lineUp.length; i++) {
            horseList.add(lineUp[i]);
        }
        return horseList;
    }

//    Reverses initial Array.
    public static ArrayList<String> reverseLineup(ArrayList<String> lineUp) {
        Collections.reverse(lineUp);
        return lineUp;
    }

//    Generates the required String from an array entry and index.
    public static String modifyEntry(int index, String entry) {
        String modifiedEntry = String.format("%d- %s! \n", index+1, entry);
        return modifiedEntry;
    }

//    Execution of the program.
    public static void printLineUp() {
        ArrayList<String> lineUp = reverseLineup(generateHorseLineUp());
        for (int i=0; i<lineUp.size();i++){
            System.out.print(modifyEntry(i, lineUp.get(i)));
        }
    }
}