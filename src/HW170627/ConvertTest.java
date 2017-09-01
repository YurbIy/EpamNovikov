package HW170627;

import common.Asserts;

/**
 * Created by Yurbly on 29.06.2017.
 */
public class ConvertTest {
    public static void main(String[] args) {
//        System.out.println(ToAnotherNotation.toOctalString(2147483647));
        System.out.println(ToAnotherNotation.toHexalString(2147483647));
        System.out.println(ToAnotherNotation.toHexalString(0));
        System.out.println(Asserts.assertEquals(ToAnotherNotation.toHexalString(2147483647), Integer.toHexString(2147483647)));
        System.out.println(Asserts.assertEquals(ToAnotherNotation.toHexalString(Integer.MIN_VALUE), Integer.toHexString(Integer.MIN_VALUE)));
        System.out.println(Asserts.assertEquals(ToAnotherNotation.toHexalString(34545243), Integer.toHexString(34545243)));
        System.out.println(Asserts.assertEquals(ToAnotherNotation.toHexalString(-124232), Integer.toHexString(-124232)));

        System.out.println(Asserts.assertEquals(ToAnotherNotation.toOctalString(2147483647), Integer.toOctalString(2147483647)));


        System.out.println(Asserts.assertEquals(ToAnotherNotation.toBinaryString(-124232), Integer.toBinaryString(-124232)));
        System.out.println(Asserts.assertEquals(ToAnotherNotation.toBinaryString(1), Integer.toBinaryString(1)));
        System.out.println(Asserts.assertEquals(ToAnotherNotation.toBinaryString(0), Integer.toBinaryString(0)));
        System.out.println(Asserts.assertEquals(ToAnotherNotation.toBinaryString(-1), Integer.toBinaryString(-1)));
        System.out.println(Asserts.assertEquals(ToAnotherNotation.toBinaryString(Integer.MAX_VALUE), Integer.toBinaryString(Integer.MAX_VALUE)));
        System.out.println(Asserts.assertEquals(ToAnotherNotation.toBinaryString(Integer.MIN_VALUE), Integer.toBinaryString(Integer.MIN_VALUE)));
    }
}
