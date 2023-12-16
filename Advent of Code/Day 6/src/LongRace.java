import java.util.ArrayList;

public class LongRace {
    long time;
    long distance;

//    Generates an instance of Race object.
    public void generate(long timeEntry, long distanceEntry){
        time = timeEntry;
        distance = distanceEntry;
    }

//    Gets the amount of possible combinations that result in a win for a Race instance.
    public int getNumberWinningCombinations(){
        int winningCombinations = 0;

        for(int holdButtonTime = 0; holdButtonTime<distance; holdButtonTime++){
            // x = x0 + vt
            long initialSpeed = holdButtonTime;
            long remainingTime = time - holdButtonTime;
            if (initialSpeed * remainingTime > distance){
                winningCombinations++;
            }
        }

        return winningCombinations;
    }
}
