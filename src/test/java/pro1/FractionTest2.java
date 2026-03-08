package pro1;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class FractionTest2 {
    @Test
    void test() {
        assertEquals("2/5", new Fraction(400,1000).toString());
    }
}
