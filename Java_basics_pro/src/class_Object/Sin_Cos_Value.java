package class_Object;

import java.util.Scanner;

public class Sin_Cos_Value 
{

	public static void main(String[] args) 
	{
	double x,sin_value,cos_value;
	System.out.println("please enter any value to find sin and cos value ");
	Scanner scan = new Scanner(System.in);
	x=scan.nextDouble();
	sin_value=Math.sin(x);
	cos_value=Math.cos(x);
	System.out.println(" The given value is " +x +"\n" +" The sign value is " +sin_value + "\n" +" The cos value is " +cos_value);
	scan.close();
	}

}
