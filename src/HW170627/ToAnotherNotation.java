package HW170627;

import java.util.Arrays;

/**
 * Created by Yurbly on 29.06.2017.
 */
public class ToAnotherNotation {

    public static String toOctalString(int a){
        if(a == Integer.MIN_VALUE) return String.valueOf(20_000_000_000L);
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
//        System.out.println(Arrays.toString(octIntArray));
        return stb.toString();
    }



    public static String toAnotherNotation(int value, int base) {



        return null;
    }
}
