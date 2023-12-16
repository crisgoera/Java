import java.io.*;
import java.util.*;
import org.jsoup.*;
import org.jsoup.nodes.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print(parseTimeData() + "\n");
        System.out.print(parseDistanceData() + "\n");


        int multiplier = 1;
        for (Race entry : getRaceArray(parseTimeData(), parseDistanceData())){
            multiplier = multiplier * entry.getNumberWinningCombinations();
        }

        System.out.print(multiplier + "\n");

        LongRace longRace = new LongRace();
        longRace.generate(35696887,213116810861248L);
        System.out.print(longRace.getNumberWinningCombinations() + "\n");

        System.out.print("Finished!");

    }

//    Parses input file into text.
    public static String[] parser() throws IOException {
        File file = new File("resources/input");
        Document doc = Jsoup.parse((file));
        return doc.body().text().split(":");
    }

//    Formats time data from parsed file.
    public static ArrayList<Integer> parseTimeData () throws IOException {
        String[] timeString = parser()[1].split("Distance")[0].trim().split(" ");
        ArrayList<Integer> parsedTime = new ArrayList<>();

        for (String timeEntry : timeString){
            parsedTime.add(Integer.parseInt(timeEntry));
        }

        return parsedTime;
    }

//    Formats distance data from parsed file.
    public static ArrayList<Integer> parseDistanceData () throws IOException {
        String[] timeString = parser()[2].trim().split(" ");
        ArrayList<Integer> parsedDistance = new ArrayList<>();

        for (String timeEntry : timeString){
            parsedDistance.add(Integer.parseInt(timeEntry));
        }

        return parsedDistance;
    }

//    Obtains the list of Race objects from the parsed file.
    public static ArrayList<Race> getRaceArray(ArrayList<Integer> timeData, ArrayList<Integer> distanceData) {
        ArrayList<Race> raceList = new ArrayList<>();


        for (int i = 0; i< timeData.size(); i++) {
            Race newRace = new Race();
            newRace.generate(timeData.get(i), distanceData.get(i));
            raceList.add(newRace);
        }

        return raceList;
    }

    //    Prints the list of Race objects obtained from the parsed text.
    public static void printRaceArray() throws IOException {
        ArrayList<Race> raceList = getRaceArray(parseTimeData(), parseDistanceData());

        for (Race race : raceList){
            System.out.print("Time " + race.time + "\n");
            System.out.print("Distance " + race.distance + "\n");
        }
    }
}