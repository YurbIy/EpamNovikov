package HW170811.mySearchAlgs;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Yurbly on 13.08.2017.
 */
public class SearchAlgsUse {

    public static void main(String[] args) {
        final int SIZE = 40_000_000;
        Random r = new Random();
        int[] array = new int[SIZE];
        for (int i = 0; i < SIZE; i++){
            array[i] = i;
        }
        Arrays.sort(array);
        int keyIndex = r.nextInt(SIZE);
        int key = array[keyIndex];
        System.out.println(keyIndex + " : " + key);
        System.out.println();

        use(new MyLinearSearch(), array, key);
        System.out.println();
        use(new MyBinarySearch(), array, key);


    }

    public static void use(Searcher searcher, int[] array, int key){
        long start = System.currentTimeMillis();
        int index = searcher.search(array, key);
        long end = System.currentTimeMillis();
        System.out.println(searcher.getClass().getSimpleName());
        System.out.println("Index: " + index);
        System.out.println("Time: " + (end - start));


    }

}
