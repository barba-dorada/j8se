package i5;

import java.time.LocalTime;


/**
 * 7. Implement a TimeInterval class that represents an interval of time, suitable for
 * calendar events (such as a meeting on a given date from 10:00 to 11:00).
 * Provide a method to check whether two intervals overlap.
 */


class TimeInterval {
    LocalTime start;
    LocalTime end;

    private TimeInterval() {
    }

    public static TimeInterval of(String interval) {
        String[] i = interval.split("-");
        TimeInterval ti = new TimeInterval();
        ti.start = LocalTime.parse(i[0]);
        ti.end = LocalTime.parse(i[1]);
        return ti;
    }

    public boolean overlap(TimeInterval ti) {

        min(this.start,ti.start);
        return false;
    }
    private LocalTime min(LocalTime time,LocalTime time2){
        return time;
    }
}
