package class_Object;

import java.util.Scanner;

public class Problem_a_plus_b_square
{
	int a,b,result;
	void accept()
	{
		System.out.println("please enter a and b values");
		Scanner s = new Scanner(System.in);
		a=s.nextInt();
		b=s.nextInt();
		process();
		s.close();
	}
	void process()
	{
		result=(a*a)+(b*b)+(2*a*b);
		System.out.println("The value for a+b whole square is " +result);
		
	}

	public static void main(String[] args) 
	{

		new Problem_a_plus_b_square().accept();		
	}

}
