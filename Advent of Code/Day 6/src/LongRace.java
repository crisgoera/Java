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
    public long getNumberWinningCombinations(){
        long[] extremeValues = quadratic();
        return extremeValues[0]- extremeValues[1];
    }

//    Gets the extreme values where hold button time = distance.
    public long[] quadratic(){
        long[] maxMin = new long[2];
        long t0sq = (long) Math.pow(time,2);
        long firstSolution = (long) (time+Math.sqrt(t0sq-4*distance))/2;
        long secondSolution = (long) (time-Math.sqrt(t0sq-4*distance))/2;

        maxMin[0] = firstSolution;
        maxMin[1] = secondSolution;
        return maxMin;
    }
}