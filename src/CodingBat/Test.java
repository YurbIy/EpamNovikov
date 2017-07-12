package CodingBat;

import CodingBat.WarmUp.WarmUp_1;
import CodingBat.WarmUp.WarmUp_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Yurbly on 26.06.2017.
 */
public class Test {
    public static void main(String[] args) {

//        System.out.println("yolka".substring(3,6));
//        ArrayList<String> list = new ArrayList<>();
//        List<String> strings = Collections.unmodifiableList(list);
       char[] value = {'a', 'b', 'c'};
        StringBuilder stb = new StringBuilder();
        stb.insert(0, value);
        System.out.println(stb.toString());
    }

    static int[] test(int a[]){
        return new int[2];
    }

}
