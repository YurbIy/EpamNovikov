package HW20170624.sign;

import HW20170624.SimpleUnit;

/**
 * Created by Yurbly on 27.06.2017.
 */
public class    SignTest {

    public static void main(String[] args) {
        System.out.println(SimpleUnit.assertEquals(Sign.sign(-25), -1));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(Integer.MIN_VALUE), -1));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(3), 1));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(Integer.MAX_VALUE), 1));
        System.out.println(SimpleUnit.assertEquals(Sign.sign(0), 0));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(-25), 0));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(-25), 1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(25), 0));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(25), -1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(0), -1));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(0), 1));

        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(0), Integer.MAX_VALUE));
        System.out.println(SimpleUnit.assertNotEquals(Sign.sign(0), Integer.MIN_VALUE));
    }
}
