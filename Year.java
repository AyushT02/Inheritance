
public class Year
{
    int days;
    int month;
    int day;
    public Year() {
        this.days = 365;
    }
    public int getDays(int month) {
        if(month == 2) {
            days = 28;
        } 
        else if(month == 1 || month == 3 || month == 5 || month == 7 || month  == 8 || month == 10 || month == 12) {
            days = 31;
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11) {
            days = 30;
        }
        else {
            throw new IllegalArgumentException("Invalid month");
        }
        return days; 
    }
    public int daysElapsed(int month, int day) {
        int daysPrev = 0;
        for (int i = 1; i < month; i++) {
            int daysInMonth = getDays(i);
            daysPrev = daysInMonth + daysPrev;
        }
        int daysElapsed = daysPrev + day;
        this.month = month;
        this.day = day;
        return daysElapsed;
    }
}
