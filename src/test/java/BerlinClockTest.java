import be.intec.berlinclock.BerlinClock;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BerlinClockTest {
    @Test
    public void test_00_00_00() {
        assertEquals("Y\n" +
                "OOOO\n" +
                "OOOO\n" +
                "OOOOOOOOOOO\n" +
                "OOOO\n", BerlinClock.getTime("00:00:00"));
    }

    @Test
    public void test_13_17_01() {
        assertEquals("O\n" +
                "RROO\n" +
                "RRRO\n" +
                "YYROOOOOOOO\n" +
                "YYOO\n", BerlinClock.getTime("13:17:01"));
    }

    @Test
    public void test_23_59_59() {
        assertEquals("O\n" +
                "RRRR\n" +
                "RRRO\n" +
                "YYRYYRYYRYY\n" +
                "YYYY\n", BerlinClock.getTime("23:59:59"));
    }

    @Test
    public void test_24_00_00() {
        assertEquals("Y\n" +
                "RRRR\n" +
                "RRRR\n" +
                "OOOOOOOOOOO\n" +
                "OOOO\n", BerlinClock.getTime("24:00:00"));
    }
}
