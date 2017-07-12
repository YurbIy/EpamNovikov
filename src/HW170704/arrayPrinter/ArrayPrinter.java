package HW170704.arrayPrinter;

/**
 * Created by Yurbly on 06.07.2017.
 */
public class ArrayPrinter {
    public static void print(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            if (i == a.length -1) break;
            System.out.print(", ");
        }
        System.out.println("]");

    }
}
