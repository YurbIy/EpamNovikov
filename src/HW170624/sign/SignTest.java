package HW170624.sign;

import common.Asserts;

/**
 * Created by Yurbly on 27.06.2017.
 */
public class    SignTest {

    public static void main(String[] args) {
        System.out.println(Asserts.assertEquals(Sign.sign(-25), -1));
        System.out.println(Asserts.assertEquals(Sign.sign(Integer.MIN_VALUE), -1));
        System.out.println(Asserts.assertEquals(Sign.sign(3), 1));
        System.out.println(Asserts.assertEquals(Sign.sign(Integer.MAX_VALUE), 1));
        System.out.println(Asserts.assertEquals(Sign.sign(0), 0));
        System.out.println(Asserts.assertNotEquals(Sign.sign(-25), 0));
        System.out.println(Asserts.assertNotEquals(Sign.sign(-25), 1));
        System.out.println(Asserts.assertNotEquals(Sign.sign(25), 0));
        System.out.println(Asserts.assertNotEquals(Sign.sign(25), -1));
        System.out.println(Asserts.assertNotEquals(Sign.sign(0), -1));
        System.out.println(Asserts.assertNotEquals(Sign.sign(0), 1));

        System.out.println(Asserts.assertNotEquals(Sign.sign(0), Integer.MAX_VALUE));
        System.out.println(Asserts.assertNotEquals(Sign.sign(0), Integer.MIN_VALUE));
    }
}
