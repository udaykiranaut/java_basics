package SetDemo;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<String> values = new LinkedHashSet<>();
		values.add("selenium");
		values.add("uft");
		values.add("12");
		values.add("manual");
		values.add("webdrive");
		System.out.println(values);
		for(String e:values) {
			System.out.println(e);
		}
	}

}
