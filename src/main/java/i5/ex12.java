package i5;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 12. Write a program that solves the problem described at the beginning of
 Section 5.5, “Zoned Time,” on page 109. Read a set of appointments in different
 time zones and alert the user which ones are due within the next hour in
 local time.
 */
public class ex12 {
    public static void main(String[] args) {
       /* Instant now = Instant.now();
        ZonedDateTime utc = now.atZone(ZoneOffset.UTC);
        System.out.println(utc);
        ZoneId.getAvailableZoneIds().stream().sorted().forEach((x) -> {
            System.out.println(x);
            //ZoneId.of(x).
        });*/
        // TODO: 22.09.2016  Obtain the offsets
        //  ZoneOffset.UTC;
    }
}
