package HW170627;

import java.util.Arrays;

/**
 * Created by Yurbly on 29.06.2017.
 */
public class ToAnotherNotation {

    public static String toBinaryString(int a){
        if(a == Integer.MIN_VALUE) return "10000000000000000000000000000000";
        long value = Math.abs(a);
        int[] digitArray = new int[32];
        for (int i = 0; i < 32; i++) {
            digitArray[i] = (int)(value % (((long) Math.pow(2,32 - i)))/((long) Math.pow(2,31 - i)));
        }
//        System.out.println("Positive array: " + Arrays.toString(digitArray));
        if(a < 0){

            digitArray[0] = 1 - digitArray[0];
//            System.out.println("0: " + digitArray[0]);
            for(int i = 1; i < digitArray.length; i++){
                digitArray[i] = 1 - digitArray[i];
            }
//            System.out.println("Converted positive array: " + Arrays.toString(digitArray));
//            System.out.println("0: " + digitArray[0]);
            if (digitArray[digitArray.length - 1] < 1) digitArray[digitArray.length - 1] ++;
            else {
                digitArray[digitArray.length - 1] = 0;
                for (int i = digitArray.length - 2; i > 0; i--){
                    if (digitArray[i] == 0) {
                        digitArray[i]++;
                        digitArray[i + 1] = 0;
//                        System.out.println("Broke");
                        break;
                    }
//                    digitArray[i - 1] ++;
                    digitArray[i] = 0;
//                    System.out.println("Array: " + Arrays.toString(digitArray));
//                    System.out.println("0: " + digitArray[0]);
                }
            }
        }

//        System.out.println("0: " + digitArray[0]);

        StringBuilder stb = new StringBuilder();


        boolean flag = false;
        for (int number : digitArray) {
            if(number == 0 && !flag) continue;
            flag = true;
            stb.append(number);
        }
        if(stb.toString().equals("")){
            stb.append('0');
        }
//        System.out.println(Arrays.toString(digitArray));
        return stb.toString();
    }

    public static String toOctalString(int a){
        if(a == Integer.MIN_VALUE) return "20000000000";
        long value = Math.abs(a);
        int[] octIntArray = new int[11];
        for (int i = 0; i < 11; i++) {
            octIntArray[i] = (int)(value % (((long) Math.pow(8,11 - i)))/((long) Math.pow(8,10 - i)));
        }
//        System.out.println("Positive array: " + Arrays.toString(octIntArray));
        if(a < 0){

            octIntArray[0] = 3 - octIntArray[0];
//            System.out.println("0: " + octIntArray[0]);
            for(int i = 1; i < octIntArray.length; i++){
                octIntArray[i] = 7 - octIntArray[i];
            }
//            System.out.println("0: " + octIntArray[0]);
            if (octIntArray[octIntArray.length - 1] < 7) octIntArray[octIntArray.length - 1] ++;
            else {
                octIntArray[octIntArray.length - 1] = 0;
                for (int i = octIntArray.length - 2; i > 0; i--){
                    if (octIntArray[i] < 7) {
                        octIntArray[i]++;
                        octIntArray[i + 1] = 0;
                        break;
                    }
                    octIntArray[i - 1] ++;
                    octIntArray[i] = 0;
//                    System.out.println("0: " + octIntArray[0]);
                }
            }
        }

//        System.out.println("0: " + octIntArray[0]);

        StringBuilder stb = new StringBuilder();


        boolean flag = false;
        for (int number : octIntArray) {
            if(number == 0 && !flag) continue;
            flag = true;
            stb.append(number);
        }
        if(stb.toString().equals("")){
            stb.append('0');
        }
//        System.out.println(Arrays.toString(octIntArray));
        return stb.toString();
    }

    public static String toHexalString(int a){
        if(a == Integer.MIN_VALUE) return "80000000";
        long value = Math.abs(a);
        int[] octIntArray = new int[8];
        for (int i = 0; i < 8; i++) {
            octIntArray[i] = (int)(value % (((long) Math.pow(16,8 - i)))/((long) Math.pow(16,7 - i)));
        }
//        System.out.println("Positive array: " + Arrays.toString(octIntArray));
        if(a < 0){

            octIntArray[0] = 15 - octIntArray[0];
//            System.out.println("0: " + octIntArray[0]);
            for(int i = 1; i < octIntArray.length; i++){
                octIntArray[i] = 15 - octIntArray[i];
            }
//            System.out.println("0: " + octIntArray[0]);
            if (octIntArray[octIntArray.length - 1] < 15) octIntArray[octIntArray.length - 1] ++;
            else {
                octIntArray[octIntArray.length - 1] = 0;
                for (int i = octIntArray.length - 2; i > 0; i--){
                    if (octIntArray[i] < 15) {
                        octIntArray[i]++;
                        octIntArray[i + 1] = 0;
                        break;
                    }
                    octIntArray[i - 1] ++;
                    octIntArray[i] = 0;
//                    System.out.println("0: " + octIntArray[0]);
                }
            }
        }

//        System.out.println("0: " + octIntArray[0]);

        StringBuilder stb = new StringBuilder();


        boolean flag = false;
        for (int number : octIntArray) {
            if(number == 0 && !flag) continue;
            flag = true;
            if(number > 9){
                if(number == 10) stb.append('a');
                if(number == 11) stb.append('b');
                if(number == 12) stb.append('c');
                if(number == 13) stb.append('d');
                if(number == 14) stb.append('e');
                if(number == 15) stb.append('f');
                if(number > 15) System.out.println("Error in digits");
            }
            else {
                stb.append(number);
            }
        }
        if(stb.toString().equals("")){
            stb.append('0');
        }
//        System.out.println(Arrays.toString(octIntArray));
        return stb.toString();
    }



    public static String toAnotherNotation(int value, int base) {



        return null;
    }
}
