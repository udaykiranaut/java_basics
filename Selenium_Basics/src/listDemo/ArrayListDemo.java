package listDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add(98765456);
		obj1.add('U');
		obj1.add("selenium web drive");
		obj1.add(123.456);
		System.out.println(obj1);
		System.out.println(obj1.get(3));
	}
}
