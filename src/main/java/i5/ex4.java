package i5;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 4. Write an equivalent of the Unix cal program that displays a calendar for a
 month. For example, java Cal 3 2013 should display
              1  2  3
  4  5  6  7  8  9 10
 11 12 13 14 15 16 17
 18 19 20 21 22 23 24
 25 26 27 28 29 30 31
 indicating that March 1 is a Friday. (Show the weekend at the end of the week.)
 */
public class ex4 {
    public static void main(String[] args) {
        int month=3;
        int year=2013;
        LocalDate d = LocalDate.of(year, month, 1);
        LocalDate dEnd = d.plusMonths(1);
        for(int i=1;i<d.getDayOfWeek().getValue();i++){
            System.out.printf("   ");
        }
        while(d.isBefore(dEnd)) {
            System.out.printf("%2s ", d.getDayOfMonth());
            if(d.getDayOfWeek()== DayOfWeek.SUNDAY){
                System.out.println();
            }
            d = d.plusDays(1);
        }
    }
}
