package HW170627;

/**
 * Created by Yurbly on 29.06.2017.
 */
public class ConvertTest {
    public static void main(String[] args) {
        System.out.println(ToAnotherNotation.toOctalString(2147483647));
        System.out.println(ToAnotherNotation.toAnotherNotation(2147483647, 8));
//        System.out.println((2147483647 % (int) Math.pow(8, 11)));
//        System.out.println(Math.abs(-2147483648L));
//        System.out.println(2147483647 / 1073741824);
//        System.out.println(SimpleUnit.assertEquals(ToAnotherNotation.toOctalString(2147483647), Integer.toOctalString(2147483647)));
    }
}
