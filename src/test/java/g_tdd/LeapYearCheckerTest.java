package g_tdd;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LeapYearCheckerTest {

    @Test
    public void LeapYearChecker_whenPassing2016_shouldBeTrue() {
    LeapYearChecker leapYearChecker = new LeapYearChecker();
    boolean simpleYear = leapYearChecker.isLeapYear(2016);
        Assertions.assertEquals(true,simpleYear);
    }

    @Test
    public void LeapYearChecker_whenPassing2015_shouldBeFalse() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        boolean simpleYear = leapYearChecker.isLeapYear(2015);
        Assertions.assertEquals(false,simpleYear);
    }
}
