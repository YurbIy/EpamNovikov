package HW170707;

import java.util.Arrays;
import java.util.Objects;

public class MyStringArrayList<T> {

	private static final int DEFAULT_SIZE = 2;

	private Object[] elements = new Object[DEFAULT_SIZE];

	//  [a,b,c,d,e,f]
	//   0 1 2 3 4 5

	private int size = 0;

	public void add(T t) {

		if (size == elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}

		elements[size++] = t;
//		size = size + 1;
	}

	@Override
	public String toString() {
		return Arrays.toString(elements);
	}

	//  [a,b,c,d,e,_]
	//   0 1 2 3 4 5
	//  [a,b,d,e,_,_]
	//   0 1 2 3 4

	public void remove(int i) {
		if (i >= size || i < 0) {
			return;
		}

		System.arraycopy(elements, i+1, elements, i, --size - i);
		elements[size] = null;

	}

	public T get(int index){
		return (T) elements[index];
	}

	public void set(int index, T el){
		elements[index] = el;
	}

	public int size(){
		return size;
	}

	public boolean isEmpty(){
		return size == 0;
	}

	public void remove(T value){
		for(int i = 0; i < size; i++){
			if(elements[i].equals(value)){
				remove(i);
				return;
			}
		}
	}
	
	

}
