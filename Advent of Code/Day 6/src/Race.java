public class Race {
    int time;
    int distance;

    public Race generate(int time, int distance){
        Race race = new Race();
        race.time = time;
        race.distance = distance;

        return race;
    }
}
