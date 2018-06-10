package class_Object;

import java.util.Scanner;

public class Odd_or_Even 
{
	void process(int m)
	{
		if(m==0)
		{
			System.out.println("Please enter positive integer value");
		}else if(m>0)
		{
			if(m%2==0)
			{
				System.out.println("The Number is even number");
			}else
			{
				System.out.println("The Number is odd");
			}
		}
	}

	public static void main(String[] args) 
	{	
		System.out.println("Please enter any value");
		Scanner scan = new Scanner(System.in);
		int k = Integer.parseInt(scan.nextLine());
		Odd_or_Even oe = new Odd_or_Even();
		oe.process(k);
	scan.close();

	}

}
