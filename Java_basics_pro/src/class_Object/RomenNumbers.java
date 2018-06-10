package class_Object;

import java.util.Scanner;

public class RomenNumbers 
{	
	void value(int y)
	{
		while(y>=1000)
		{
			System.out.print("M");
			y=y-1000;
		}
		if(y>=900)
		{
			System.out.print("CM");
		y=y-900;
		}
		if(y>=500)
		{
			System.out.print("D");
			y=y-500;
		}
		if(y>=400)
		{
			System.out.print("CD");
			y=y-400;
		}
		while(y>=100)
		{
			System.out.print("C");
			y=y-100;
		}
		if(y>=90)
		{
			System.out.print("XC");
			y=y-90;
		}
		if(y>=50)
		{
			System.out.print("L");
			y=y-50;
		}
		if(y>=40)
		{
			System.out.print("XL");
			y=y-40;
		}
		if(y>=10)
		{
			System.out.print("X");
			y=y-10;
		}if(y>=9)
		{
			System.out.print("IX");
			y=y-9;
		}if(y>=5)
		{
			System.out.print("V");
			y=y-5;
		}
		if(y>=4) {
			System.out.print("IV");
		y=y-4;
	}
	if(y>=1)
	{
		System.out.print("I");
		y=y-1;
		
	}
}

	public static void main(String[] args) 
	{
		int x;
		System.out.println("Please enter any positive value");
		Scanner scan = new Scanner(System.in);
		x=scan.nextInt();
		if(x<=0) {
			System.out.println("please enter a value greater than 0");
		}
		RomenNumbers rn = new RomenNumbers();
		rn.value(x);
		scan.close();

	}

}
