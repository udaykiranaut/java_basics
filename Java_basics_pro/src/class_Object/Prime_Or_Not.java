package class_Object;

import java.util.Scanner;

public class Prime_Or_Not 
{
	
	void prime(int x)
	{
		
		if((x==2)||(x==3))
		{
			System.out.println("The given number  " +x +" is prime");
		}
		if(x>2&x>3)
		{
			if((x%2!=0)&(x%3!=0))
			{
			System.out.println("The given number  " +x +" is prime");
			
			}else 
			{
			System.out.println("The given number  " +x +" not prime");
			
			}
		}
	}

	public static void main(String[] args) 
	{
		int number;
		System.out.println("please enter any positive Integer ");
		Scanner scan = new Scanner(System.in);
		number=scan.nextInt();
		if(number>0)
		{
		Prime_Or_Not pon = new Prime_Or_Not();
		pon.prime(number);
		}else if(number==0)
		{
			System.out.println(" Please enter number greater than 0 ");
		}else 
		{
			System.out.println("Please enter positive Integer");
		}
			scan.close();
	}

}
