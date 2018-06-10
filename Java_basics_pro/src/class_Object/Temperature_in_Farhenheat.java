package class_Object;

import java.util.Scanner;

public class Temperature_in_Farhenheat 
{	double c,f;
	void accept()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("please enter the temperature in celcius");
		c = s.nextDouble();
		farhenheat();
		s.close();
	}
	void farhenheat()
	{
		f=(c*1.8)+32;
		int tem_far = (int) f;
		System.out.println("The temperature in farhenheat is " +tem_far);
	}

	public static void main(String[] args) 
	{
		new Temperature_in_Farhenheat().accept();

	}

}
