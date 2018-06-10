package thisDemo;

import java.util.Scanner;

public class ThisAddObject
{
	int a,b;
	ThisAddObject()
	{
		a=b=0;
		
	}
	ThisAddObject(int a,int b)
	{
		this.a=a;
		this.b=b;
		int c = this.a+this.b;
		System.out.println("the sum of two values 1--" +c);
	}
	ThisAddObject(ThisAddObject x1)
	{
		this.a=x1.a+1;
		this.b=x1.b+1;
		int d = this.a+this.b;
		System.out.println("the sum of two values 2--" +d);
	}
	ThisAddObject(ThisAddObject u2 ,ThisAddObject u3)
	{
		System.out.println("The default values are " +this.a +"---" +this.b);
		System.out.println("First object values " +u2.a +"---" +u2.b);
		System.out.println("Second object values " +u3.a +"----" +u3.b);
		
		this.a=u2.a+u3.a;
		this.b=u2.b+u3.b;
		System.out.println("The individual values respectively after adding - - a and b " +this.a +"---" +this.b);
		int e = this.a+this.b;
		System.out.println("the sum of values of two objects is -- " +e);
		
	}
	public static void main(String[] args)
	{
		int m,n;
		Scanner s = new Scanner(System.in);
		System.out.println("please enter two values");
		m=s.nextInt();
		n=s.nextInt();
		ThisAddObject c1 = new ThisAddObject(m,n);
		ThisAddObject c2 = new ThisAddObject(c1);
		ThisAddObject c3 = new ThisAddObject(c1,c2);
	

	}

}
