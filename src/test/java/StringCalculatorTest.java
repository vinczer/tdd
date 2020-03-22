import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    @Test
    public void resultIsZeroWhenInputIsEmptyString() {
        String input = "";

        int actual = StringCalculator.calculate(input);

        assertEquals(0, actual);
    }

    @Test
    public void resultIsNumberWhenInputIsNumber() {
        String input = "1";

        int actual = StringCalculator.calculate(input);

        assertEquals(1, actual);
    }

    @Test
    public void resultIsNumberWhenInputIsAnotherNumber() {
        String input = "2";

        int actual = StringCalculator.calculate(input);

        assertEquals(2, actual);
    }

    @Test
    public void resultIsSumOfTwoNumbersWhenInputIsTwoSingleDigitNumbersCommaDelimited() {
        String input = "2,3";

        int actual = StringCalculator.calculate(input);

        assertEquals(5, actual);
    }

    @Test
    public void resultIsSumOfTwoNumbersWhenInputIsTwoMultiDigitNumbersCommaDelimited() {
        String input = "12,30";

        int actual = StringCalculator.calculate(input);

        assertEquals(42, actual);
    }
}