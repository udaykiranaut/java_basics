package class_Object;

import java.util.Scanner;

public class Print_N_Numbers 
{
	void print(int k)
	{ 	int m;
		System.out.println("The number are ");
		for( m=1;m<=k;m++)
		{
			System.out.println(m);
			
		}
	}

	public static void main(String[] args) 
	{
		int a;
		System.out.println("please enter any number");
		Scanner scan = new Scanner(System.in);
		a=scan.nextInt();
		Print_N_Numbers no = new Print_N_Numbers();
		no.print(a);
		scan.close();
	
			

	}

}
