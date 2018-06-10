package scanner;

import java.util.Scanner;

public class Demo_nextzzz 
{
	
	public static void main(String[] args)
	{
	    int x,y,z;
	    Scanner s = new Scanner(System.in);
	    System.out.println("please enter the values of x and y");
	    x = s.nextInt();
	    y = s.nextInt();
	    z = x*y;
	    System.out.println("The product is " +z);
	}
}
