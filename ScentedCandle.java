

public class ScentedCandle extends Candle
{  String scent;
   public ScentedCandle(String color, int height, String scent) {
       super(color, height);
       this.scent = scent;
       price = 3 * height;
    }
   public String getScent() {
     return scent;  
    }
}
