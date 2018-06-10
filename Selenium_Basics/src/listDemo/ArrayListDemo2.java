package listDemo;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add(98765456);
		obj1.add('U');
		obj1.add("selenium web drive");
		obj1.add(123.456);
		obj1.add('U');
		int mylistsize=obj1.size();
		System.out.println("The size of list is "+mylistsize);
		for(int i=0;i<mylistsize;i++)
		{
			System.out.println("value of ArrayList " + "at index " +i +"is "+ obj1.get(i));
		}
	}
}
