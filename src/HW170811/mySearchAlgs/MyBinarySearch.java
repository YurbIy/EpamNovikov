package HW170811.mySearchAlgs;

/**
 * Created by Yurbly on 13.08.2017.
 */
public class MyBinarySearch implements Searcher {

    public int search(int[] array, int key){

        int lo = 0;
        int hi = array.length - 1;
        int index = 1;
        while (lo <= hi){
            index = lo + (hi - lo) / 2;
            if (key > array[index]){
                lo = index + 1;
            }
            else if (key < array[index]){
                hi = index - 1;
            }
            else{
                return index;
            }
        }
        return -index - 1;

    }
}
