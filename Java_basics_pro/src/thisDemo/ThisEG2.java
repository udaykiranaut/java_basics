package thisDemo;

import java.util.Scanner;

public class ThisEG2 
{
	int a,b;
	ThisEG2(int a ,int b)
	{
		this.a=a;
		this.b=b;
		this.a=this.a+1;
		this.b=this.b+1;
		System.out.println("value of formal parameters a is--" +a);
		System.out.println("calue of formal parameters b is--" +b);
		System.out.println("-------------------------------------");
	}
	void disp()
	{
		System.out.println(" The value of Data Memebers");
		System.out.println("value of data members a is--" +this.a);
		System.out.println("calue of data members b is--" +this.b);
		System.out.println("-------------------------------------");
	}
	

	public static void main(String[] args) 
	{
		int x,y,k,l;
		System.out.println("please enter the values for formal parameters and data members");
		Scanner s1 = new Scanner(System.in);
		x=s1.nextInt();
		y=s1.nextInt();
		k=s1.nextInt();
		l=s1.nextInt();
		ThisEG2 to1 = new ThisEG2(x,y);
		to1.disp();
		ThisEG2 to2 = new ThisEG2(k,l);
		to2.disp();
		
			
	}

}
