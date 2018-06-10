package listDemo;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		ArrayList<String> obj1=new ArrayList<String>();
		obj1.add("kiran");
		obj1.add("kumra");
		obj1.add("hyderabad");
		obj1.add("12");
		for(String v:obj1)
		{
			System.out.println(v);
		}
		
		

	}

}
