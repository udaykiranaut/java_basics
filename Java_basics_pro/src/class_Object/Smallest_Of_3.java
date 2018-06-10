package class_Object;

import java.util.Scanner;

public class Smallest_Of_3 
{
	void process(int x,int y ,int z)
	{
		if(x<y&x<z)
		{
			System.out.println("The gratest number is " +x);
		}else if(y<x&y<z)
		{
			System.out.println("The gratest number is " +y);
		}else if(z<x&z<y)
		{
			System.out.println("The gratest number is " +z);
		}
	}

	public static void main(String[] args) 
	{
		int a,b,c;
		System.out.println("Please enter any 3 values");
		Scanner scan = new Scanner(System.in);
		a=Integer.parseInt(scan.nextLine());
		b=Integer.parseInt(scan.nextLine());
		c=Integer.parseInt(scan.nextLine());
		Smallest_Of_3 l3 = new Smallest_Of_3();
		l3.process(a, b, c);
		scan.close();

	}

}
