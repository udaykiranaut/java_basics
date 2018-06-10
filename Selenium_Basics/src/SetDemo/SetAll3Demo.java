package SetDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetAll3Demo {

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
		ArrayList<String> list = new ArrayList<>(values);
		System.out.println(list.get(4));
		TreeSet<String> l1 = new TreeSet<>(list);
		System.out.println(l1);

	}

}
