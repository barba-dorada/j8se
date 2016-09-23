package i5;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 11. Your return flight leaves Frankfurt at 14:05 and arrives in Los Angeles at
 16:40. How long is the flight? Write a program that can handle calculations
 like this.
 */
public class ex11 {
    public static void main(String[] args) {
        ZonedDateTime depFranfurkt = LocalDateTime.parse("2007-12-03T14:05").atZone(ZoneId.of("Europe/Berlin"));
        ZonedDateTime arrLosAngeles = LocalDateTime.parse("2007-12-03T16:40").atZone(ZoneId.of("America/Los_Angeles"));
        Duration dur = Duration.between(depFranfurkt, arrLosAngeles);
        System.out.println("departure: "+depFranfurkt+"\n      dur: "+dur+"\n   arrive: "+arrLosAngeles);
    }
}
