package scanner;

import java.util.Scanner;

public class Demo_nextLine {

	public static void main(String[] args) 
	{
		int a,b;
		float c,d;
		Scanner s = new Scanner(System.in);
		System.out.println("please enter two values");
		a = Integer.parseInt(s.nextLine());
		b = Integer.parseInt(s.next());
		System.out.println("The product is " +a*b);
		System.out.println("please enter another two values");
		c = s.nextFloat();
		d = s.nextFloat();
		System.out.println("the produt of float values is " +c*d);
		
		
	

	}

}
