package HW170624.isPrime;

/**
 * Created by Yurbly on 02.07.2017.
 */
public class IsPrime {
    public static boolean isPrime(int a) {
            if(a == 1) return false;
            if(a == 2) return true;

            for (int i = 2; i < (int) Math.sqrt(a); i++) {
                if(a % i == 0){
                    return false;
                }
            }
            return true;
        }


}
