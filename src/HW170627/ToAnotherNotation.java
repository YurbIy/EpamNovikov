package HW170627;

import java.util.Arrays;

/**
 * Created by Yurbly on 29.06.2017.
 */
public class ToAnotherNotation {
//TODO доработать под дополнительный код
    public static String toOctalString(int x){
        String s = "";
        char[] ch = new char[11];
        long temp;
        boolean flag = false;
        if(x < 0){
            ch[0] = '2';
            s += "-";
        }
        long a = Math.abs(x);
        for(int i = 10; i >= 0; i--){
            System.out.print(10 - i + ":  ");

            temp = (a % (long) Math.pow(8, i + 1))/ (long) Math.pow(8, i);
            System.out.print("temp = " + temp);
            if((temp != 0) || flag) {
                System.out.println( " ; flag = " + flag);
                s += String.valueOf(temp);
                flag = true;
            }
            else System.out.println();
        }
        if(x < 0){
            ch[0] = '2';
            s += "-";
        }
        return s;
    }
    
    public static String toOctalString2(int a){
        int value = Math.abs(a);
        long posOctVal;
        int[] octIntArray = new int[11];
        for (int i = 0; i < 11; i++) {
//            System.out.println(i);
            octIntArray[i] = (int)(value % (((long) Math.pow(8,11 - i)))/((long) Math.pow(8,10 - i)));
        }
        System.out.println(Arrays.toString(octIntArray));
//        }
        
        StringBuilder stb = new StringBuilder();
        boolean flag = false;

        for (int i: octIntArray) {
            if(i == 0 && flag) continue;
            flag = true;
            stb.append(i);
        }
        return stb.toString();
    }

    public static String toAnotherNotation(int value, int base) {



        return null;
    }
}
