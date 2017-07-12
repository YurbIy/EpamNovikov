package HW170706;

import common.Asserts;

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

//        System.out.println(Asserts.assertEquals(s.trim().toString(), "String"));
//        System.out.println(Asserts.assertEquals(s1.trim().toString(), "String"));
//        System.out.println(Asserts.assertEquals(s2.trim().toString(), "String"));
//        System.out.println(Asserts.assertEquals(s3.trim().toString(), "String"));
//        System.out.println(Asserts.assertEquals(s4.trim().toString(), ""));

        System.out.println(Asserts.assertEquals(s3.replace('r', '?').toString(), "St?ing"));
        System.out.println(Asserts.assertEquals(s3.replace('S', '?').toString(), "?tring"));
        System.out.println(Asserts.assertEquals(s3.replace('g', '?').toString(), "Strin?"));

        ;
    }
}
