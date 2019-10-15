
public class RaceHorse extends Horse {
    public int races;
    public RaceHorse(String name, String color, int BirthYear, int races) {
        super(name, color, BirthYear);
        this.races = races;
    }
    public int getRaces() {
        return races;
    }
}
