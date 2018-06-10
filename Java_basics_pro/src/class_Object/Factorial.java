package class_Object;

import java.util.Scanner;

public class Factorial 
{

	public static void main(String[] args) 
	{
		int number,fact = 1;
		System.out.println("Please Enter A Number To Find Factorial");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		
		if(number<=0)
		{
			System.out.println("Please Enter Value Greter Than 0 ");
		}
		for(int i=1;i<=number;i++)
		{
			fact =fact*i;
		}
		System.out.println("The Factorial of the number  " +number +" is " +fact);
		scan.close();
		
	}

}
