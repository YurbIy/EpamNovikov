package HW20170627;

/**
 * Created by Yurbly on 29.06.2017.
 */
public class ToAnotherNotation {

    public static String toOctalString(int x){
        String s = "";
        long temp;
        boolean flag = false;
        if(x < 0){
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
        return s;
    }
}
