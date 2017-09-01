package HW170707;

//import mytestframework.Asserts;

import common.Asserts;

import java.util.Arrays;

public class StringMethodsPractice {
	
	public static void main(String[] args) {
		
		String s = "   Hello ";
		String s2 = "Hello";  // trimmed
		String s3 = "  Hello";
		String s4 = "Hello  ";
		String s5 = "  He l l o  ";
		//             ^1     ^2   
		String s6 = "";
		

		System.out.println(Asserts.assertEquals(trim(s6), s6));
		System.out.println(Asserts.assertEquals(trim(s2), s2));
		System.out.println(Asserts.assertEquals(trim(s3), s2));
		System.out.println(Asserts.assertEquals(trim(s4), s2));
		System.out.println(Asserts.assertEquals(trim(s5), "He l l o"));
		System.out.println();
		System.out.println(Asserts.assertEquals(replace("hello", 'l', 'p'), "heppo"));
		System.out.println(Asserts.assertEquals(replace("hello", 'e', 'x'), "hxllo"));
		System.out.println(Asserts.assertEquals(replace("", 'e', 'x'), ""));
		System.out.println(Asserts.assertEquals(replace("hello", 'x', 'z'), "hello"));

	}

	private static String trim(String s) {

		if (s == null || s.length() == 0) {
			return s;
		}
		if (hasNoTrailingOrLeadingSpaces(s)) {
			return s;
		}
		StringBuilder stb = new StringBuilder(s);
		for(int i = 0; i < stb.length() && stb.charAt(i) <= ' ';){
				stb.deleteCharAt(i);
		}
		for(int i = stb.length() - 1; i >= 0 && stb.charAt(i) <= ' ';i--){
				stb.deleteCharAt(i);
		}
		return stb.toString();
	}

	private static boolean hasNoTrailingOrLeadingSpaces(String s) {
		return s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1;
	}

	public static String replace(String s, char old, char nev){

		char[] ch = s.toCharArray();
		for(int i = 0; i < ch.length;i++){
			if(ch[i] == old){
				ch[i] = nev;
			}
		}

		return String.valueOf(ch);
	}

}
