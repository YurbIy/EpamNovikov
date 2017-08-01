package Tests;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by Yurbly on 14.07.2017.
 */
public class A {
    static class B{
        void m() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
            System.out.println("one");
        }
    }

    static class C extends  B{
        @Override
        void m() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
            System.out.println("two");
        }
        void m(int i){

        }
        void m(String s){

        }
    }

    static class D extends C{
        @Override
        void m() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
//            String str = "m()";
//            Class a = B.class;
//            Method meth = a.getMethod(str);
//            meth.invoke(this);

        }

    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        B b = new C();
        ((C)b).m(2);
    }
}
