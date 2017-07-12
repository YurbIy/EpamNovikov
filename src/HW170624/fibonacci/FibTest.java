package HW170624.fibonacci;

import common.Asserts;

/**
 * Created by Yurbly on 02.07.2017.
 */
public class FibTest {
    public static void main(String[] args) {
        System.out.println(Asserts.assertEquals(Fib.isFib(73), false));
        System.out.println(Asserts.assertEquals(Fib.isFib(34), true));
        System.out.println(Asserts.assertEquals(Fib.isFib(4181), true));
        System.out.println(Asserts.assertEquals(Fib.isFib(10946), true));
        System.out.println(Asserts.assertEquals(Fib.isFib(5659), false));
        System.out.println(Asserts.assertEquals(Fib.isFib(345), false));
        System.out.println(Asserts.assertEquals(Fib.isFib(0), true));
    }
}
