package CodingBat.Logic;

import java.util.Arrays;

/**
 * Created by Yurbly on 16.07.2017.
 */
public class Logic_2 {

    public boolean makeBricks(int small, int big, int goal) {
        if (big * 5 + small < goal) return false;
        if (goal <= small) return true;
        if (goal / 5 <= (big + small / 5) && goal % 5 <= small) return true;

        return false;

    }



    public int loneSum(int a, int b, int c) {
        int sum = 0;
        if(b != a && a != c) {
            sum += a;
        }
        if(b != a && c != b) {
            sum += b;
        }
        if(b != c && c != a) {
            sum += c;
        }
        return sum;
    }

    public int luckySum(int a, int b, int c) {
        int sum = 0;
        if(a == 13) return sum;
        else sum += a;
        if(b == 13) return sum;
        else sum += b;
        if(c == 13) return sum;
        else sum += c;
        return sum;

    }


    public int noTeenSum(int a, int b, int c) {

        return fixTeen(a) + fixTeen(b) + fixTeen(c);

    }

    public int fixTeen(int n) {
        if ((n >= 13 && n < 15) || (n > 16 && n <= 19)){
            return 0;
        }
        return n;
    }

    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);

    }

    public int round10(int num) {
        int abs = Math.abs(num);
        if(abs % 10 < 5) return abs - (abs % 10);
        else return abs + (10 - (abs % 10));

    }

    public boolean closeFar(int a, int b, int c) {
        if(Math.abs(a - b) <= 1){
            if (Math.abs(a - c) > 1 && Math.abs(b - c) > 1){
                return true;
            }
        }
        if(Math.abs(a - c) <= 1){
            if (Math.abs(b - c) > 1 && Math.abs(b - a) > 1){
                return true;
            }
        }

        return false;
    }

    public int blackjack(int a, int b) {
        if (21 - a < 0) a = 0;
        if (21 - b  < 0) b = 0;
        return a > b ? a : b;
    }

    public boolean evenlySpaced(int a, int b, int c) {
        int[] ar = {a,b,c};
        Arrays.sort(ar);
        if ( Math.abs(ar[0] - ar[1]) == Math.abs(ar[1] - ar[2])) return true;
        return false;
    }

}
