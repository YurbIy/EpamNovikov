package HW170809;

import java.util.Arrays;
import java.util.List;
import HW170809.Dictionary.*;
public class UseDictionary2 {
	
	public static void main(String[] args) {
		
		Dictionary<String,Integer> d = new Dictionary<>();
		
		d.put("Pete", 25);
		d.put("John", 27);
		d.put("Вася", 23);
		d.put("Петя", 56);
		d.put("Боря", 76);
		d.put("Оля", 34);
		d.put("Жанна", 60);
		d.put("Маша", 16);
		d.put("Вано", 45);
		d.put("ssdf", 45);
		d.put("Вds", 45);
		d.put("Вsaa", 45);

		System.out.println();

		System.out.println(d.get("Ann"));
		System.out.println(d.get("John"));
		System.out.println(d.get("Вася"));
//
		d.put("Вася", 24);
		System.out.println(d.get("Вася"));
//
//		for (Dictionary.Pair pair : d) {
//			System.out.println(pair.key + " : " + pair.value);
//		}
		System.out.println();
		System.out.println(d.toString());



	}

}
