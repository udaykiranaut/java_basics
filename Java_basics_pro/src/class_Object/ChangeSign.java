package class_Object;

import java.util.Scanner;

public class ChangeSign 
{
	void change(int y)
	{
		y=-(y);
		System.out.println(y);
		
	}

	public static void main(String[] args)
	{
		int x;
		System.out.println("please enter any value");
		Scanner scan = new Scanner(System.in);
		x=scan.nextInt();
		if(x==0)
		{
			System.out.println("The given nunmber is 0 we can not change the sign");
		}
		ChangeSign cs = new ChangeSign();
		cs.change(x);
		scan.close();

	}

}
