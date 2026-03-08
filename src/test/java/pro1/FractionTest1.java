package pro1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FractionTest1 {

    @Test void test1() { Assertions.assertEquals("12/25", new Fraction(72, 150).toString()); }

    @Test void test2() { Assertions.assertEquals("1/2", new Fraction(4, 8).toString()); }

    @Test void test3() { Assertions.assertEquals("-3/5", new Fraction(-9, 15).toString()); }

    @Test void test4() { Assertions.assertEquals("-3/5", new Fraction(9, -15).toString()); }

    @Test void test5() { Assertions.assertEquals("0/1", new Fraction(0, 7).toString()); }
}
