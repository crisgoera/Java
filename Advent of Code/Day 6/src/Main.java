import java.io.*;
import java.lang.reflect.Array;
import java.util.*;
import org.jsoup.*;
import org.jsoup.nodes.*;

public class Main {
    public static void main(String[] args) throws IOException {
        for (String entry : parser()) {
            System.out.print(entry + "\n");
        }
        System.out.print(parseTimeData() + "\n");
        System.out.print(parseDistanceData() + "\n");
        Race firstEntry = new Race();
        firstEntry.generate(7,9);
        System.out.print(firstEntry.time);
        System.out.print(firstEntry.distance);
    }


    public static String[] parser() throws IOException {
        File file = new File("resources/testInput.html");
        Document doc = Jsoup.parse((file));
        return doc.body().text().split(":");
    }

    public static ArrayList<Integer> parseTimeData () throws IOException {
        String[] timeString = parser()[1].split("Distance")[0].trim().split(" ");
        ArrayList<Integer> parsedTime = new ArrayList<>();

        for (String timeEntry : timeString){
            parsedTime.add(Integer.parseInt(timeEntry));
        }

        return parsedTime;
    }

    public static ArrayList<Integer> parseDistanceData () throws IOException {
        String[] timeString = parser()[2].trim().split(" ");
        ArrayList<Integer> parsedDistance = new ArrayList<>();

        for (String timeEntry : timeString){
            parsedDistance.add(Integer.parseInt(timeEntry));
        }

        return parsedDistance;
    }

    public static ArrayList<Race> getRaceArray(ArrayList<Integer> timeData, ArrayList<Integer> distanceData) {
        ArrayList<Race> raceList = new ArrayList<>();
        Race newRace = new Race();

        for (int i = 0; i< timeData.size(); i++) {
            newRace.generate(timeData.get(i), distanceData.get(i));
            raceList.add(newRace);
        }

        return raceList;
    }

    public static void printRaceArray() throws IOException {
        ArrayList<Race> raceList = getRaceArray(parseTimeData(), parseDistanceData());

        for (Race race : raceList){
            System.out.print(race.time);
            System.out.print(race.distance + "\n");
        }
    }
}