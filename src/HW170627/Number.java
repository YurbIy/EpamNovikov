package HW170627;

import java.util.Arrays;

/**
 * Created by Yurbly on 09.07.2017.
 */
class Number{

    private long value;
    private int length;
    private int[] intArray;

    Number(int a, int base) {

         value = Math.abs(a);
        length = 0;


        //ищем длину числа
         for (int i = 0; ; i++) {
             if (Integer.MAX_VALUE / (long) Math.pow(base, i) == 0) {
                 length = i + 1;
                 break;
             }
//             System.out.print(i+": ");
//             System.out.println(Integer.MAX_VALUE / (int) Math.pow(base, i));
         }

        intArray = new int[length];

         //заполняем массив цифрами
         for (int i = 0; i < length; i++) {
             intArray[i] = (int) (value % (((long) Math.pow(base, length - i))) / ((long) Math.pow(base, length - 1 - i)));
         }

     }

     public String toString(){
         StringBuilder stb = new StringBuilder();
         boolean flag = false;
         for (int number : intArray) {
             if(number == 0 && !flag) continue;
             flag = true;
             if(number > 9){
                 stb.append( Character.valueOf(((char) (87 + number))));
             }
             else {
                 stb.append(number);
             }
         }
        return stb.toString();
    }

}
