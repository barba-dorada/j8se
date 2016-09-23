package i5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 6. List all Friday the 13th in the twentieth century.
 */
public class ex6 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(1901, 1, 1);
        LocalDate end = LocalDate.of(2001, 1, 1);
        LocalDate current = start.withDayOfMonth(13);
        while(current.isBefore(end)){
            if(current.getDayOfWeek()== DayOfWeek.FRIDAY){
                System.out.println(DateTimeFormatter.ofPattern("dd MMM E YYYY").format(current));
            }
            current=current.plusMonths(1);
        }

    }
}
