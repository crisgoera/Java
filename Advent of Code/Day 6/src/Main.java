import java.io.*;
import java.util.*;
import org.jsoup.*;
import org.jsoup.nodes.*;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print(parseTimeData() + "\n");
        System.out.print(parseDistanceData() + "\n");

        Race firstEntry = getRaceArray(parseTimeData(), parseDistanceData()).get(0);
        System.out.println(firstEntry.time);
        System.out.println(firstEntry.distance);

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


        for (int i = 0; i< timeData.size(); i++) {
            Race newRace = new Race();
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