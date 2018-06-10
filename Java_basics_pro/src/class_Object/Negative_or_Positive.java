package class_Object;

import java.util.Scanner;

public class Negative_or_Positive
{
	void process(int a)
	{
		
		if(a<0)
		{
			System.out.println("The number is negative number");
		}else if(a>0)
		{
			System.out.println("The number is positive number");
		}else if(a==0)
		{
			System.out.println("The entered number is " +a);
		}
	}

	public static void main(String[] args) 
	{
		System.out.println("please enter any value");
		Scanner scan = new Scanner(System.in);
		int y = Integer.parseInt(scan.nextLine());
		Negative_or_Positive np = new Negative_or_Positive();
		np.process(y);
		scan.close();
	}

}
