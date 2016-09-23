package i5;

import java.time.LocalDate;

/**
 3. Implement a method next that takes a Predicate<LocalDate> and returns an
 adjuster yielding the next date fulfilling the predicate. For example,
 today.with(next(w -> getDayOfWeek().getValue() < 6))
 computes the next workday.
 */
public class ex3 {
    public static void main(String[] args) {
        // TODO: 23.09.2016  
        LocalDate today = LocalDate.now();//.with(ChronoField.DAY_OF_YEAR, 256);
      /*  today.with(next(w -> getDayOfWeek().getValue() < 6));
        System.out.println(d);*/
    }
}
