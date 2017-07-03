package HW170629;

import java.util.Random;

/**
 * Created by Yurbly on 30.06.2017.
 */
public class DNAGenerator {

    static final byte[] alphabet = {'A', 'C', 'G', 'T'};



    public static byte[] Generate(int i) {
        Random random = new Random();

        byte[] seq = new byte[i];
        for (int j = 0; j < i; j++) {
            seq[j] = alphabet[random.nextInt(4)];

        }

        return seq;

    }

//    static String Generate(int length){
//
//        Random random = new Random();
//
//        return "";
//    }


}
