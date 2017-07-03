package HW170629;

/**
 * Created by Yurbly on 30.06.2017.
 */
public class CoincFinder {


    public static int Find(byte[] seq, int w) {

        if(seq.length <= w){
            return 0;
        }

        int count = 0;

        for (int i = 0; i < seq.length - w; i++) {
            that:
            for (int j = i + 1; j <= seq.length - w; j++) {
                for (int k = 0; k < w; k++) {
                    if(seq[i + k] != seq[j + k]){
                        continue that;
                    }

                }
                System.out.println("i = " + i + " j = " + j);
                count++;
            }
        }


        return count;
    }
}
