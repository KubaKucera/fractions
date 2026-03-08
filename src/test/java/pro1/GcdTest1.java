package pro1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GcdTest1 {

    @Test void test1() { Assertions.assertEquals(10, NumericUtils.gcd(20, 50)); }

    @Test void test2() { Assertions.assertEquals(6, NumericUtils.gcd(18, 24)); }

    @Test void test3() { Assertions.assertEquals(1, NumericUtils.gcd(7, 9)); }

    @Test void test4() { Assertions.assertEquals(5, NumericUtils.gcd(0, 5)); }

    @Test void test5() { Assertions.assertEquals(4, NumericUtils.gcd(-8, 12)); }

    @Test void test6() { Assertions.assertEquals(3, NumericUtils.gcd(3, 3)); }
}
