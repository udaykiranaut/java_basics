package class_Object;

import java.util.Scanner;

public class power_Of_N
{
	public static void main(String[] args)
	{
		double x,y;
		System.out.println("please enter a value and power value ");
		Scanner scan = new Scanner(System.in);
		x=scan.nextDouble();
		y=scan.nextDouble();
		if(x<=0)
		{
			System.out.println("please eneter a value greater than 0");
		}
		double power =  Math.pow(x, y);
		System.out.println(power);
		scan.close();

	}

}
