package HW20170624.fibonacci;

import HW20170624.SimpleUnit;

/**
 * Created by Yurbly on 02.07.2017.
 */
public class FibTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(Fib.isFib(73), false));
        System.out.println(SimpleUnit.assertEquals(Fib.isFib(34), true));
        System.out.println(SimpleUnit.assertEquals(Fib.isFib(4181), true));
        System.out.println(SimpleUnit.assertEquals(Fib.isFib(10946), true));
        System.out.println(SimpleUnit.assertEquals(Fib.isFib(5659), false));
        System.out.println(SimpleUnit.assertEquals(Fib.isFib(345), false));
        System.out.println(SimpleUnit.assertEquals(Fib.isFib(0), true));
    }
}
