import java.io.IOException;

public class Game {
    int gameId;
    int redCubes;
    int blueCubes;
    int greenCubes;

    public static void main(String[] args) throws IOException {
        Game test = new Game();
        Game test2 = new Game();
        test.constructor(97,8, 7, 2);
        test2.constructor(52, 13,5,7);
        System.out.print(test.viability() +"\n");
        System.out.print(test2.viability() + "\n");
    }
    public void constructor(int id, int red, int blue, int green){
        gameId=id;
        redCubes=red;
        blueCubes=blue;
        greenCubes=green;
    }

    public boolean viability(){
        return redCubes <= 12 && blueCubes <= 14 && greenCubes <= 13;
    }
}
