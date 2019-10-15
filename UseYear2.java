

public class UseYear2
{
   public static void main() {
       Year y2 = new LeapYear2();
       System.out.println(y2.daysElapsed(3, 5));
       Year y3 = new Year();
       System.out.println(y3.daysElapsed(3, 5));
    }
}
