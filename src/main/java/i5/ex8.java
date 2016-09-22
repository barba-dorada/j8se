package i5;

import java.time.Instant;
import java.time.ZoneId;

/**
 * 8. Obtain the offsets of today’s date in all supported time zones for the current
 * time instant, turning ZoneId.getAvailableIds into a stream and using stream
 * operations.
 */
public class ex8 {
    public static void main(String[] args) {
        Instant now = Instant.now();
        ZoneId.getAvailableZoneIds().stream().sorted().forEach((x) -> System.out.println(x));
        // TODO: 22.09.2016  Obtain the offsets
    }
}
