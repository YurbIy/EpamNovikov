package HW20170624.moduloDivision;

import HW20170624.SimpleUnit;

/**
 * Created by Yurbly on 02.07.2017.
 */
public class ModuloDivTest {
    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(ModuloDiv.modDiv(5, 2), (5%2)));
        System.out.println(SimpleUnit.assertEquals(ModuloDiv.modDiv(3, 2), (3%2)));
        System.out.println(SimpleUnit.assertEquals(ModuloDiv.modDiv(3, 2), (3%2)));
        test(-3, -2);
        test(-3, 2);
        test(3, -2);
        test(63, 63);
        test(63, 7);
        test(63, 10);
        test(Integer.MAX_VALUE, 10);
        test(Integer.MAX_VALUE, Integer.MAX_VALUE);
        test(Integer.MIN_VALUE, Integer.MAX_VALUE);
        test(Integer.MIN_VALUE, Integer.MIN_VALUE);
        test(Integer.MAX_VALUE, Integer.MIN_VALUE);
    }

    static void test(int a, int b){
        System.out.println(SimpleUnit.assertEquals(ModuloDiv.modDiv(a, b), (a % b)));
    }
}
