

public class TennisGame
{
   String player1;
   String player2;
   int finalScore1;
   int finalScore2;
   String final1;
   String final2;
   public TennisGame() {
       this.player1 = "";
       this.player2 = "";
       this.finalScore1 = 0;
       this.finalScore2 = 0;
       this.final1 = "";
       this.final2 = "";
    }
   public TennisGame(String player1, String player2, int finalScore1, int finalScore2) {
       this.player1 = player1;
       this.player2 = player2;
       this.finalScore1 = finalScore1;
       this.finalScore2 = finalScore2;
       if (finalScore1 < 0 || finalScore1 > 4 || finalScore2 < 0 || finalScore2 > 4) {
           finalScore1 = 0;
           finalScore2 = 0;
           final1 = "error";
           final2 = "error";
       }
       if(finalScore1 == 0 || finalScore2 == 0) {
           final1 = "love";
           final2 = "love";
       }
       if(finalScore1 == 1 || finalScore2 == 1) {
           final1 = "15";
           final2 = "15";
       }
       if(finalScore1 == 2 || finalScore2 == 2) {
           final1 = "30";
           final2 = "30";
       }
       if(finalScore1 == 3 || finalScore2 == 3) {
           final1 = "40";
           final2 = "40";
       }
       if(finalScore1 == 4 || finalScore2 == 4) {
           final1 = "game";
           final2 = "game";
       }
       if(finalScore1 == 4 && finalScore2 == 4) {
           finalScore1 = 0;
           finalScore2 = 0;
           final1 = "error";
           final2 = "error";
        }
    }
   public void setPlayer1(String p1) {
       p1 = player1;
    }
   public void setPlayer2(String p2) {
       p2 = player2;
    }
   public void setFinalScore1(int f1) {
       f1 = finalScore1;
       if(finalScore1 < 0 || finalScore1 > 4) {
           finalScore1 = 0;
        }
    }
   public void setFinalScore2(int f2) {
       f2 = finalScore2;
       if(finalScore2 < 0 || finalScore2 > 4) {
          finalScore2 = 0;
        }
    }
   public void setFinal1(String F1) {
       F1 = final1;
       if (finalScore1 < 0 || finalScore1 > 4) {
           final1 = "error";
        }
    }
   public void setFinal2(String F2) {
       F2 = final2;
       if (finalScore2 < 0 || finalScore2 > 4) {
           final2 = "error";
        }
    }
   public String getPlayer1() {
       return player1;
    }
   public String getPlayer2() {
       return player2;
    }
   public int getFinalScore1() {
       return finalScore1;
    }
   public int getFinalScore2() {
       return finalScore2;
    }
   public String getFinal1() {
       return final1;
    }
   public String getFinal2() {
       return final2;
    }
}
