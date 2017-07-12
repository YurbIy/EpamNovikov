package HW170712;

import java.util.Date;

/**
 * Created by Yurbly on 12.07.2017.
 */
public class MyStringStack {


    private static final int DEFAULT_SIZE = 3;
    private int size = 0;
    private String[] value;

    public MyStringStack() {
        value = new String[DEFAULT_SIZE];
    }
    public MyStringStack(int size) {
        value = new String[size];
    }

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();
        stb.append("[");
        if(size == 0) stb.append("]");
        else{
            stb.append(value[0]);
            for (int i = 1; i < size; i++){
                stb.append(", ");
                stb.append(value[i]);
            }
            stb.append("]");
        }
        return stb.toString();
    }

    public boolean add(String value) {
        if (size >= this.value.length) return false;
        this.value[size++] = value;
        return true;
    }
}
