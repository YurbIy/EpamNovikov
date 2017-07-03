package HW20170624.sign;

/**
 * Created by Yurbly on 27.06.2017.
 */
public class Sign {
    static int sign(int a){

        if (a < 0) {
            return -1;
        }
        if (a > 0){
            return 1;
        }
        return 0;

    }
}
