package HW170712;

import java.util.EmptyStackException;

/**
 * Created by Yurbly on 12.07.2017.
 */
public class MyStringStack<E> {


    private static final int DEFAULT_SIZE = 3;
    private int size = 0;
    private Object[] elements;

    public MyStringStack() {
        elements = new Object[DEFAULT_SIZE];
    }
    public MyStringStack(int size) {
        elements = new Object[size];
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        stb.append("[");
        if(size == 0) stb.append("]");
        else{
            stb.append(elements[0]);
            for (int i = 1; i < size; i++){
                stb.append(", ");
                stb.append(elements[i]);
            }
            stb.append("]");
        }
        return stb.toString();
    }

    public boolean push(E value) {
        if (size >= this.elements.length) return false;
        this.elements[size++] = value;
        return true;
    }

    public boolean empty(){
        return size <= 0;
    }

    public E peek(){
        if(size == 0) throw new EmptyStackException();
        
        return (E) elements[size - 1];
    }

    public E pop(){

        E e = peek();
        elements[size--] = null;
        return e;
    }

}
