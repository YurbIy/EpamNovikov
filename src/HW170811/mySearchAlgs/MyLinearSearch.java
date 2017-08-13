package HW170811.mySearchAlgs;

/**
 * Created by Yurbly on 13.08.2017.
 */
public class MyLinearSearch implements Searcher {

    public int search(int[] array, int key){
        int count = 0;
        for(int a : array){
            if(a == key) return count;
            count++;
        }
        return -1;
    }
}
