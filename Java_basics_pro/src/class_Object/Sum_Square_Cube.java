package class_Object;

import java.util.Scanner;

public class Sum_Square_Cube 
{
	int y,temp = 0;
	void sum(int x)
	{
		for(int s=1;s<=x;s++)
		{
			y=x;
			temp=temp+s;
		}
		System.out.println("sum of natural numbers till " +x +" Numbers is " +temp);
		System.out.println("-----------------------------------------------------");
		square();
	}
	
	void square()
	{
		for(int sq=1;sq<=y;sq++)
		{
			int square = sq*sq;
		    System.out.println("The square of number " +sq +" is " +square);    
		}
		System.out.println("-----------------------------------------------------");
		cube();
	}
	void cube()
	{
		for(int c=1;c<=y;c++)
		{
			int cube = c*c*c;
			System.out.println("The cube of the number " +c +" is " +cube);
		}
	}

	public static void main(String[] args) 
	{
	   int number;
	   System.out.println("Please enter any positive Integer");
	   Scanner scan = new Scanner(System.in);
	   number = Integer.parseInt(scan.nextLine());
	   scan.close();
	   if(number>0)
	   {
		   Sum_Square_Cube ssc = new Sum_Square_Cube();
		   ssc.sum(number);
		   
		   
	   }else if(number==0)
	   {
		   System.out.println("Please enter value greater than zero");
	   }else {
		   System.out.println("please eneter value greater than zero");
	   }
	}
}
