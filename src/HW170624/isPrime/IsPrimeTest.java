package HW20170624.isPrime;

import HW20170624.SimpleUnit;

import java.util.Date;

/**
 * Created by Yurbly on 02.07.2017.
 */
public class IsPrimeTest {
    public static void main(String[] args) {
//        System.out.println(IsPrime.isPrime(1) = true);
//        System.out.println(IsPrime.isPrime(2));
//        System.out.println(IsPrime.isPrime(3));
//
//        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(4),false));
//        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(5),true));
//        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(25),false));
//        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(127),true));
//        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(5987),true));
//        System.out.println(SimpleUnit.assertEquals(IsPrime.isPrime(5987),false));
//
        test(2, true);
        test(5988, false);
        test(5987, true);
        test(Integer.MAX_VALUE, true);
        test(561, false);

//        System.out.println(127%126);
    }

    static void test(int a, boolean expected){
        System.out.print(" Number is " + a + "; ");
        Date start = new Date();
        System.out.print("Result is: " + SimpleUnit.assertEquals(IsPrime.isPrime(a),expected));
        Date end = new Date();
        System.out.println("; It takes " + (end.getTime() - start.getTime()) + "ms to calculate");

    }
}
