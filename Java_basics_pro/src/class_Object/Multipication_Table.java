package class_Object;

import java.util.Scanner;

public class Multipication_Table 
{
	void table(int a,int max)
	{
		int m;
		System.out.println("The multiplication table for " +a +" is");
		
		for(m=1;m<=max;m++)
		{ 	
			int v = a*m;
			System.out.println(a +"*" +m +" = " +v);	
		}
		
	}

	public static void main(String[] args) 
	{
		int k ,l;
		System.out.println("enter any number for Multiplication Table ");
		Scanner scan = new Scanner(System.in);
		k=Integer.parseInt(scan.nextLine());
		
		if(k>0)
		{
		System.out.println("Enter maximum value to which you want to print");
		l=Integer.parseInt(scan.nextLine());
		Multipication_Table mt =new Multipication_Table();
		mt.table(k,l);
		}else if(k==0){
			System.out.println("please enter value greater than 0");
		}
		else {
			System.out.println("please enter value greater than 0");
		}
		scan.close();
	}
}
