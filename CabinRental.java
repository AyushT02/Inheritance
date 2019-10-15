

public class CabinRental
{
    int cabinNum;
    double weeklyRate;
    public CabinRental(int cn) {
        cn = cabinNum;
        if(cn == 1 || cn == 2 || cn == 3) {
            weeklyRate = 950;
        } else {
            weeklyRate = 1100;
        }
        System.out.println(weeklyRate);
    }
}
