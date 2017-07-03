package HW170701.matrix;

import HW170624.SimpleUnit;

/**
 * Created by Yurbly on 03.07.2017.
 */
public class MatrixTest {
    public static void main(String[] args) {
//        test(MatrixGenerator.generate());

        int[][] t = {{1, 2, 3},
                     {4, 5, 6},
                     {7, 8, 9}};

        int[][] t2 = {{1, -2, 3},
                     {4, 5, 6},
                     {7, 8, -9}};

//        test(t, 0);
//        test(t, 1);
//        test(t, 2);
//        test(t2, 0);
//        test(t2, 1);
//        test(t2, 2);
        test(MatrixGenerator.generate(4, true), 2);
        test(MatrixGenerator.generate(4, false), 2);
        test(MatrixGenerator.generate(3, true), 2);
        test(MatrixGenerator.generate(3, false), 2);
        test(MatrixGenerator.generate(6, true), 4);
        test(MatrixGenerator.generate(6, false), 4);
        test(MatrixGenerator.generate(8, true), 7);
        test(MatrixGenerator.generate(8, false), 7);
//        test(MatrixGenerator.generate(5), 2);

    }

    private static void test(int[][] matrix, int row) {
        System.out.println("Computing the row №" + row);
        matrixPrinter(matrix);
        RowElSum.rowElSum(matrix, row);

//        System.out.println(SimpleUnit.assertEquals(RowElSum.rowElSum(matrix), rightSum));
    }

    static void matrixPrinter(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();

        }
    }


}
