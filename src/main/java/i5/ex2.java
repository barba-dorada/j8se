package i5;

import java.time.LocalDate;

/**
 2. What happens when you add one year to LocalDate.of(2000, 2, 29)? Four years?
 Four times one year?
 */
public class ex2 {
    public static void main(String[] args) {
        LocalDate d = LocalDate.of(2000, 2, 29);
        System.out.println(d);
        System.out.println(d.plusYears(1));
        System.out.println(d.plusYears(4));
        System.out.println(d.plusYears(1).plusYears(1).plusYears(1).plusYears(1));
    }
}
