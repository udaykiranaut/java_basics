package listDemo;

import java.util.ArrayList;

public class ArrayList_EnhancedFor {

	public static void main(String[] args) {
		ArrayList obj1 = new ArrayList();
		obj1.add(98765456);
		obj1.add('U');
		obj1.add("selenium web drive");
		obj1.add(123.456);
	
		for(Object abc:obj1)
		{
			System.out.println("values are " +abc);
		}
	}
}
