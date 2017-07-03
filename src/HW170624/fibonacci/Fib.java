package HW20170624.fibonacci;

/**
 * Created by Yurbly on 02.07.2017.
 */
public class Fib {
    //TODO выбрать более оптимальную верхнюю границу
    public static boolean isFib(int a) {
        if(a == 0) return true;
        if(a == 1) return true;

        for(int i = 2, a1 = 0, a2 = 1, a3; i < a; i++){
            a3 = a1 + a2;

            if(a == a3) return true;
            a1 = a2;
            a2 = a3;
        }
        return false;
    }
}
