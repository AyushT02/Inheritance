
public class DemoTennisGames
{
    public static void main() {
        TennisGame Match1 = new DoublesTennisGame("P1", "P2", 2, 3, "PT1", "PT2");
        System.out.println(Match1.getFinal1());
        System.out.println(Match1.getFinal2());
    }
}
