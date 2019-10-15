

public class Candle
{
   private String color;
   private int height;
   int price;
   public Candle(String color, int height) {
       this.color = color;
       this.height = height;
       price = 2 * height;
    }
   public String getColor() {
       return color;
    }
   public int getHeight() {
       return height;
    }
   public int getPrice() {
       return price;
    }
   
}
