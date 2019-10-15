

public class HolidayCabinRental extends CabinRental
{
   int cabinNum;
   double weeklyRate2;
   public HolidayCabinRental(int cn) {
     super(cn);
     weeklyRate2 = weeklyRate + 150;
     System.out.println(weeklyRate2);
   }
}
