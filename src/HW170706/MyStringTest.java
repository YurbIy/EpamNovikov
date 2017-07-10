package HW170706;

import HW170624.SimpleUnit;

import java.util.Arrays;

/**
 * Created by Yurbly on 10.07.2017.
 */
public class MyStringTest {
    public static void main(String[] args) {
        MyString s = new MyString("   String   ");
        MyString s1 = new MyString("   String");
        MyString s2 = new MyString("String   ");
        MyString s3 = new MyString("String");
        MyString s4 = new MyString("");

//        System.out.println(SimpleUnit.assertEquals(s.trim().toString(), "String"));
//        System.out.println(SimpleUnit.assertEquals(s1.trim().toString(), "String"));
//        System.out.println(SimpleUnit.assertEquals(s2.trim().toString(), "String"));
//        System.out.println(SimpleUnit.assertEquals(s3.trim().toString(), "String"));
//        System.out.println(SimpleUnit.assertEquals(s4.trim().toString(), ""));

        System.out.println(SimpleUnit.assertEquals(s3.replace('r', '?').toString(), "St?ing"));
        System.out.println(SimpleUnit.assertEquals(s3.replace('S', '?').toString(), "?tring"));
        System.out.println(SimpleUnit.assertEquals(s3.replace('g', '?').toString(), "Strin?"));

        ;
    }
}
