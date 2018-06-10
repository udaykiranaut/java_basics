package class_Object;

import java.util.Scanner;

public class PerfectNumber
{

	public static void main(String[] args) 
	{
		int number,i,per=0;
		
		System.out.println("please enter any number");
		Scanner scan = new Scanner(System.in);
		number = scan.nextInt();
		if(number<=0)
		{
			System.out.println("Please enter a value greater than 0");
		}
		System.out.println("The factors of the given number " +number +" is ");
		System.out.println();
		for(i=1;i<number;i++)
		{
			if(number%i==0)
			{
				System.out.print(" " +i +"\t");
				per =per+i;
			}
		}
		if(number==per)
		{
			System.out.println();
			System.out.println("The Number is a Perfect Number");	
		}else
		{
			System.out.println();
			System.out.println("The Number is Not Perfect Number");
		}
		scan.close();
	}

}
