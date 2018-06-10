package inheritance;

import java.util.Scanner;

public class Class_Dc extends Class_IBC_1
{
		
		void sub()
		{
			int d;
			d=super.a-super.b;
			System.out.println("The value after substraction is " +d);	
		}
	
	public static void main(String[] args) 
	{
		int e,f;
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter any two values");
		e=s.nextInt();
		f=s.nextInt();
		s.close();
		Class_Dc dc = new Class_Dc();
		dc.sum(e, f);
		dc.sub();
		
	

	}

}
