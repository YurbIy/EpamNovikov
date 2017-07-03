package HW170701.matrix;

import java.util.Random;

/**
 * Created by Yurbly on 03.07.2017.
 */
public class MatrixGenerator {

    public static int[][] generate(int size, boolean onlyPositive) {

        Random random = new Random();


        int[][] matrix = new int[size][size];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (random.nextBoolean() || onlyPositive) ? random.nextInt(100) : -random.nextInt(100);
            }
        }

//        for (int[] a : matrix) {
//            for (int b : a) {
//
//            }
//
//        }
        return matrix;
    }
}
