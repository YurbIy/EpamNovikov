package HW170712;

import HW170706.MyString;
import common.Asserts;

/**
 * Created by Yurbly on 12.07.2017.
 */
public class StringStackTest {

    public static void main(String[] args) {

        MyStringStack stack = new MyStringStack(5);
        System.out.println(Asserts.assertEquals(stack.toString(), "[]"));

        stack.add("Eins");
        stack.add("Zwei");
        stack.add("Drei");

        System.out.println(Asserts.assertEquals(stack.toString(), "[Eins, Zwei, Drei]"));
    }
}
