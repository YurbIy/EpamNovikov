package HW170809;

import java.util.Random;

/**
 * Created by Yurbly on 14.08.2017.
 */
public class Benchmark {

    public static void main(String[] args) {
        Dictionary<Integer,Integer> d1 = new Dictionary<>();
        Dictionary<Integer,Integer> d2 = new Dictionary<>();
        Dictionary<Integer,Integer> d3 = new Dictionary<>();
        Random r = new Random();

        fulfil(d1, 1000);
        fulfil(d2, 10000);
        fulfil(d2, 100000);
        fulfil(d2, 1000000);

    }

    private static void fulfil(Dictionary<Integer, Integer> d, int i) {
        long start = System.currentTimeMillis();

        for(int j = 0; j < i; j++){
            Random r = new Random();
            d.put(r.nextInt(),r.nextInt());
        }

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
