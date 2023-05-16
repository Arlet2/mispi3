package tableHandlers;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class HitCheckerTest {

    private final HitChecker hitChecker = new HitChecker();

    @Test
    void InsideFirstQuarterReturnsTrue() {
        boolean result = hitChecker.isHit(1, 1.5f, 2);
        Assertions.assertTrue(result);
    }

    @Test
    void OutsideFirstQuarterReturnsFalse() {
        boolean result = hitChecker.isHit(3, 1.5f, 2);
        Assertions.assertFalse(result);
    }

    @Test
    void InsideSecondQuarterReturnsTrue() {
        boolean result = hitChecker.isHit(-1, 1.5f, 2);
        Assertions.assertTrue(result);
    }

    @Test
    void OutsideSecondQuarterReturnsFalse() {
        boolean result = hitChecker.isHit(-3, 1.5f, 2);
        Assertions.assertFalse(result);
    }

    @Test
    void InsideThirdQuarterReturnsTrue() {
        boolean result = hitChecker.isHit(-1, -1, 2);
        Assertions.assertTrue(result);
    }

    @Test
    void OutsideThirdQuarterReturnsFalse() {
        boolean result = hitChecker.isHit(-3, -1.5f, 2);
        Assertions.assertFalse(result);
    }

    @Test
    void InsideFourthQuarterReturnsTrue() {
        boolean result = hitChecker.isHit(1, -1.5f, 2);
        Assertions.assertTrue(result);
    }

    @Test
    void OutsideFourthQuarterReturnsFalse() {
        boolean result = hitChecker.isHit(3, -1.5f, 2);
        Assertions.assertFalse(result);
    }

    @Test
    void OnXAxisReturnsTrue() {
        boolean result = hitChecker.isHit(2, 0, 2);
        Assertions.assertTrue(result);
    }

    @Test
    void OutsideOnXAxisReturnsFalse() {
        boolean result = hitChecker.isHit(3, 0, 2);
        Assertions.assertFalse(result);
    }

    @Test
    void OnYAxisReturnsTrue() {
        boolean result = hitChecker.isHit(0, 1.5f, 2);
        Assertions.assertTrue(result);
    }

    @Test
    void OutsideOnYAxisReturnsFalse() {
        boolean result = hitChecker.isHit(0, 3, 2);
        Assertions.assertFalse(result);
    }
}