package i5;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

/**
 9. Again using stream operations, find all time zones whose offsets aren’t full
 hours.
 */
public class ex9 {
    // TODO: 23.09.2016
    public static void main(String[] args) {
        /*Instant now = Instant.now();
        ZonedDateTime utc = now.atZone(ZoneOffset.UTC);
        System.out.println(utc);
        ZoneId.getAvailableZoneIds().stream().sorted().forEach((x) -> {
            System.out.println(x);
            //ZoneId.of(x).
        });
        // TODO: 22.09.2016  Obtain the offsets
        //  ZoneOffset.UTC;*/
    }
}
