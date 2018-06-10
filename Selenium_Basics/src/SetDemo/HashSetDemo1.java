package SetDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class HashSetDemo1 {

	public static void main(String[] args) {
		HashSet<String> values = new HashSet<>();
   // or - // Set<String> values = new HashSet<>();
		values.add("selenium");
		values.add("uft");
		values.add("manual");
		values.add("sql");
		values.add("2");
		values.add("kiran");
		System.out.println(values);
		for(String e:values) {
			System.out.print(e +",");
		}
	
	}

}
