package HW20170624.isPrime;

/**
 * Created by Yurbly on 02.07.2017.
 */
public class IsPrime {
    public static boolean isPrime(int a) {

//        a % i
//        int j = 2;

//        for (int i = 2; i < (a / 2); i++) {
//            if(a % (a / i) == 0){
//                return false;
//            }
//        }
        for (int i = a/2; i > 1; i--) {
            if(a % i == 0){
                return false;
            }
        }

        return true;
    }
}
