package pro1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ParsingTest1 {
    @Test
    void test() {
        assertEquals("2/5", Fraction.parse("2/5").toString());
        assertEquals("2/5", Fraction.parse("40%").toString());
        assertEquals("2/5", Fraction.parse("1/5+1/5").toString());
        assertEquals("2/5", Fraction.parse("1/5+20%").toString());
        assertEquals("2/5", Fraction.parse("10%+10%+10%+10%").toString());
        assertEquals("0/1", Fraction.parse("0%").toString());
        assertEquals("0/1", Fraction.parse("0/15").toString());
    }
}
