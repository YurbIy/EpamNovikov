package HW170701.matrix;

/**
 * Created by Yurbly on 03.07.2017.
 */
public class RowElSum {
    public static void rowElSum(int[][] matrix, int row) {

        if (row >= matrix.length){
            System.err.println("Array index is out of bound, enter correct row number");
            System.exit(0);
        }

        long sum = 0;

        for (int j = 0; j < matrix[row].length; j++) {
            if (matrix[row][j] < 0) {
                System.out.println("Negative number is in this row");
                return;
            }
            sum += matrix[row][j];
        }
        System.out.println(sum);

//
//        for (int i = 0; i < ma1trix.length; i++) {
//            for (int j = 0; j < matrix[i].length; j++) {
//                if (matrix[i][j] < 0) continue;
//                sum += matrix[i][j];
//            }
//            System.out.println(i + ": ");
//
//        }

    }
}
