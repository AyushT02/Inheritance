
public class DoublesTennisGame extends TennisGame
{
 String partner1;
 String partner2;
 public DoublesTennisGame(String player1, String player2, int finalScore1, int finalScore2, String partner1, String partner2) {
    super(player1, player2, finalScore1, finalScore2);
    this.partner1 = partner1;
    this.partner2 = partner2;
    }
 public void setPartner1(String pt1) {
     pt1 = partner1;
    }
 public void setPartner2(String pt2) {
     pt2 = partner2;
    }
 public String getPartner1() {
     return partner1;
    }
 public String getPartner2() {
     return partner2;
    }
}
