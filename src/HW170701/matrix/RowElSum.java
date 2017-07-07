package HW170701.matrix;

/**
 * Created by Yurbly on 03.07.2017.
 */
public class RowElSum {
    public static void rowElSum(int[][] matrix) {


        LABEL:
        for (int i = 0; i < matrix.length; i++) {
            long sum = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < 0) {
                    System.out.println(i + ": Negative number is in the row");
                    continue LABEL;
                }
                sum += matrix[i][j];
            }
            System.out.println(i + ": " + sum);

        }
        System.out.println();

//        for (int j = 0; j < matrix[row].length; j++) {
//            if (matrix[row][j] < 0) {
//                System.out.println("Negative number is in this row");
//                return;
//            }
//            sum += matrix[row][j];
//        }
//        System.out.println(sum);



    }
}
