package HW170712;

import common.Asserts;

/**
 * Created by Yurbly on 12.07.2017.
 */
public class StringStackTest {

    public static void main(String[] args) {

        MyStringStack<String> stack = new MyStringStack<>(5);
        System.out.println(Asserts.assertEquals(stack.toString(), "[]"));


        System.out.println(Asserts.assertEquals(stack.push("Eins"), true));
        stack.push("Zwei");
        stack.push("Drei");

        System.out.println(Asserts.assertEquals(stack.toString(), "[Eins, Zwei, Drei]"));
        System.out.println();

        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.push("Vier"));
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.empty());

    }
}
