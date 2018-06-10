package listDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIterator {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add(98765456);
		obj1.add('U');
		obj1.add("selenium web drive");
		obj1.add(123.456);
		System.out.println("------------");
		Iterator itr=obj1.iterator();
		while(itr.hasNext())
		{
			Object value=itr.next();
			System.out.println("value is " +value);
		}
		
	}
}
