package class_Object;

import java.util.Scanner;

public class Square_Area_Peremeter 
{
	float s,a,p;
	void accept()
	{
		System.out.println("please enter the square side value");
		Scanner side = new Scanner(System.in);
		s=side.nextFloat();
		calculate();
		side.close();
	}
	void calculate()
	{
		a=s*s;
		System.out.println("The area of a square is " +a);
		p=4*s;
		System.out.println("The peremeter of a square is " +p);
	}

	public static void main(String[] args) 
	{
		new Square_Area_Peremeter().accept();

	}

}
