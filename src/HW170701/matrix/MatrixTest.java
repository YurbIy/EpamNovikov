package HW170701.matrix;

import HW170624.SimpleUnit;

/**
 * Created by Yurbly on 03.07.2017.
 */
public class MatrixTest {
    public static void main(String[] args) {
//        test(MatrixGenerator.generate());

        int[][] t = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};

        int[][] t2 = {
                {1, -2, 3},
                {4, 5, 6},
                {7, 8, -9}};

        matrixPrinter(t);
        RowElSum.rowElSum(t);
        matrixPrinter(t2);
        RowElSum.rowElSum(t2);


    }

    static void matrixPrinter(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
        System.out.println();
    }


}
