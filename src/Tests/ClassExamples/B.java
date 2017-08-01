package Tests.ClassExamples;

import Tests.ClassExamples.A;

/**
 * Created by Yurbly on 24.07.2017.
 */
public class B extends Tests.A {

    public static void main(String[] args) {
        B b = new B();
        new B(){
            public void print(){
                System.out.println();
            }
        };

    }
}
