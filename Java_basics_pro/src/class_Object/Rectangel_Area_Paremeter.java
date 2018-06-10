package class_Object;

import java.util.Scanner;

public class Rectangel_Area_Paremeter 
{
	float l,b,a,p;
	void accept()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("please enter values for lenght and breadth repectively");
		l=s.nextFloat();
		b=s.nextFloat();
		s.close();
	}
	void area()
	{
		a=l*b;
		System.out.println("The area of Rectangel is " +a);
	}
	void peremeter()
	{
		p=2*(l+b);
		System.out.println("the peremeter of rectangle is " +p);
	}

	public static void main(String[] args) 
	{
		Rectangel_Area_Paremeter rap = new Rectangel_Area_Paremeter();
		rap.accept();
		rap.area();
		rap.peremeter();
		

	}

}
