package HW170706;

import java.util.Arrays;

public class MyString {
	
	final char[] value;

	public MyString(String valueSource) {
		value = valueSource.toCharArray();
	}
	
	public char[] toCharArray() {
		return value;
	}
	
	@Override
	public String toString() {
		return new String(value);
	}
	
	
	
	public static void main(String[] args) {
		
		MyString s = new MyString("hello");
		
		s.toCharArray()[0] = 'b';
		
		System.out.println(s);
	}

	public MyString trim() {
//		if (value.length == 0) return Arrays.toString(value);
		StringBuilder stb = new StringBuilder();
		stb.insert(0, value);
		while (value.length != 0 && stb.charAt(0) <= ' ') {

			stb.deleteCharAt(0);
		}
		while (value.length != 0 && stb.charAt(stb.length() - 1) <= ' '){
			stb.deleteCharAt(stb.length() - 1);
		}
//		boolean notAspace = false;
//		for(int i = 0; i < value.length; i++){
//			if(value[i] <= ' ' && !notAspace) continue;
//			stb.append(value[i]);
//			notAspace = true;
//		}


		return new MyString(stb.toString());
	}

	public MyString replace(char oldChar, char newChar) {
		if(value == null || value.length == 0) return this;
		char[] ch = Arrays.copyOf(value,value.length);

		for(int i = 0; i < ch.length; i++){
			if(ch[i] == oldChar) ch[i] = newChar;
		}
		StringBuilder stb = new StringBuilder();
		stb.insert(0,ch);

		return new MyString(stb.toString());
	}
}
