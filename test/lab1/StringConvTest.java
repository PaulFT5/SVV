package lab1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringConvTest {

    private final StringConv conv = new StringConv();

    @Test
    void zero() {
        assertEquals(0, conv.strToInt("0"));
    }

    @Test
    void one() {
        assertEquals(1, conv.strToInt("1"));
    }

    @Test
    void emptyString() {
        assertEquals(0, conv.strToInt(""));
    }

    @Test
    void eight() {
        assertEquals(8, conv.strToInt("8"));
    }

    @Test
    void multiDigit() {
        assertEquals(123, conv.strToInt("123"));
    }

    @Test
    void nonDigitThrows() {
        assertThrows(NumberFormatException.class, () -> conv.strToInt("12a"));
    }
}