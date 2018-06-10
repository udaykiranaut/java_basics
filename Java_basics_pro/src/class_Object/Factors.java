package class_Object;

import java.util.Scanner;

public class Factors
{

	public static void main(String[] args) 
	{
		int number;
		System.out.println("Please Enter Any Number to find factors");
		Scanner scan = new Scanner(System.in);
		number=scan.nextInt();
		if(number<=0)
		{
			System.out.println("Please Enter Number Greater Than 0");
		}
		System.out.print("The Factors of The Give Number " +number);
		System.out.println();
		for(int i=1;i<number;i++)
		{	
			
			if(number%i==0)
			{	
				System.out.print(" " +i);
			}
		}
		scan.close();
		

	}

}
