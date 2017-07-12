package HW170627;

import common.Asserts;

/**
 * Created by Yurbly on 07.07.2017.
 */
public class Test {
    public static void main(String[] args) {

        octalTest(-10);
        //        octalTest(10);
//        octalTest(1244234234);
//        octalTest(Integer.MAX_VALUE);
//
//        binaryTest(10);
//        binaryTest(23423124);
//        binaryTest(Integer.MAX_VALUE);
//
//        hexTest(10);
//        hexTest(1223432);
//        hexTest(Integer.MAX_VALUE);



    }
    static void test ( int a){

        System.out.println(Asserts.assertEquals(ToAnotherNotation.toOctalString(a), Integer.toOctalString(a)));
    }
    static void octalTest(int a){

        Number num = new Number(a, 8);
        System.out.println(Asserts.assertEquals(num.toString(), Integer.toOctalString(a)));

    }
    static void hexTest(int a){

        Number num = new Number(a, 16);
        System.out.println(Asserts.assertEquals(num.toString(), Integer.toHexString(a)));

    }
    static void binaryTest(int a){

        Number num = new Number(a, 2);
        System.out.println(Asserts.assertEquals(num.toString(), Integer.toBinaryString(a)));

    }

    static void extendedTest(){
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++){
            if (!Asserts.assertEquals(ToAnotherNotation.toOctalString(i), Integer.toOctalString(i))){
                System.out.println("Error: " + i);
                System.exit(0);
            }
        }
    }
}