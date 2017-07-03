package HW20170629;

/**
 * Created by Yurbly on 30.06.2017.
 */
public class Test {
    public static void main(String[] args) {
        byte[] b = DNAGenerator.Generate(5);
        byte[] a = {'A', 'A','C', 'A', 'A', 'A', 'C', 'A', 'A','T', 'A', 'A', 'A'};

        test(a, 3);

    }

    static void test(byte[] b, int w){
        printByteArray(b);
        System.out.println(CoincFinder.Find(b, w));

    }

    static void printByteArray(byte[] seq){
        for (byte temp : seq) {
            System.out.print((char) temp);
        }
        System.out.println();
    }
}
