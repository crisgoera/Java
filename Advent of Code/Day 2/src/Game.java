import java.io.IOException;

public class Game {
    int gameId;
    int[] set1;
    int[] set2;
    int[] set3;

    public static void main(String[] args) throws IOException {

    }
    public void constructor(int id, int[] gameSet1, int[] gameSet2, int[] gameSet3){
        gameId=id;
        set1=gameSet1;
        set2=gameSet2;
        set3=gameSet3;
    }

    public int maxValue(int index){
        int highestValue = set1[index];
        if (set2[index]>highestValue){highestValue= set2[index];}
        if (set3[index]>highestValue){highestValue= set3[index];}

        return highestValue;
    }

    public int[] maxCubeCount() {
        int highestRed = maxValue(0);
        int highestBlue = maxValue(1);
        int highestGreen = maxValue(2);

        return new int[]{highestRed, highestBlue, highestGreen};
    }

    public boolean validity(){
        int[] cubeCount = maxCubeCount();
        int redCubes = cubeCount[0];
        int blueCubes = cubeCount[1];
        int greenCubes = cubeCount[2];

        return redCubes <= 12 && blueCubes <= 14 && greenCubes <= 13;
    }
}
