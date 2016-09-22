package i5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TimeIntervalTest {
    private final TimeInterval t1=TimeInterval.of("10:00-11:00");
    private final TimeInterval t2=TimeInterval.of("10:30-11:35");
    private final TimeInterval t3=TimeInterval.of("12:00-14:00");
    private final TimeInterval t4=TimeInterval.of("11:00-15:00");
    private final TimeInterval t5=TimeInterval.of("08:00-15:00");

    @Test
    public void overlap_t1_t2() throws Exception {
        assertEquals(true,t1.overlap(t2));
        assertEquals(true,t2.overlap(t1));
    }
    @Test
    public void overlap_t1_t1() throws Exception {
        assertEquals(true,t1.overlap(t1));
    }

    @Test
    public void overlap_t1_t5() throws Exception {
        assertEquals(true,t1.overlap(t5));
        assertEquals(true,t5.overlap(t1));
    }

    @Test
    public void not_overlap_t1_t3() throws Exception {
        assertEquals(false,t1.overlap(t3));
        assertEquals(false,t3.overlap(t1));
    }

    @Test
    public void not_overlap_t1_t4() throws Exception {
        assertEquals(false,t1.overlap(t4));
        assertEquals(false,t4.overlap(t1));
    }
}