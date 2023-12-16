import java.util.ArrayList;

public class Race {
    int time;
    int distance;

//    Generates an instance of Race object.
    public void generate(int timeEntry, int distanceEntry){
        time = timeEntry;
        distance = distanceEntry;
    }

//    Gets the amount of possible combinations that result in a win for a Race instance.
    public int getNumberWinningCombinations(){
        int winningCombinations = 0;

        for(int holdButtonTime = 0; holdButtonTime<distance; holdButtonTime++){
            // x = x0 + vt => distance = Tp * (T0-Tp)
            int initialSpeed = holdButtonTime;
            int remainingTime = time - holdButtonTime;
            if (initialSpeed * remainingTime > distance){
                winningCombinations++;
            }
        }

        return winningCombinations;
    }
}
