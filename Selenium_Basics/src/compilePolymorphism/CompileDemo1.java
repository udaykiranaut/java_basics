package compilePolymorphism;

public class CompileDemo1 {

	public static void main(String[] args) {
		CompileDemo1 obj1 = new CompileDemo1();
		obj1.add(2,3);
		obj1.add(3,3,3);
		obj1.add(10.1, 10);
		obj1.add(2, 12.22);
		obj1.add(12.22, 2);
		obj1.add(2, 12.12f,12.22);
		obj1.add(2.2f, 2, 22.22);
	}
	
		public void add(int a ,int b)
		{
			int c = a+b;
			System.out.println("the sum is " +c);
		}
		public void add(int a,int b ,int c)
		{
			int d = a+b+c;
			System.out.println("the sum for 3ar is " +d);
			
		}
		public void add(double a ,double b)
		{
			double c = a+b;
			System.out.println("the sum of double 2ar is "+c);
		}
		public void add(int a ,double b)
		{
			double c= a+b;
			System.out.println("the value of 2arg type is "+c);
		}
		public void add(double a ,int b) 
		{
		double c = a+b;
		System.out.println("the value of 2arg type is " + c);
		}
		public void add(int a , float b,double c) {
			double d = a+b+c;
			System.out.println("the value of 3arg type is " +d);
		}
		
		public void add( float a,int b ,double c) {
			double d = a+b+c;
			System.out.println("the value of 3arg type is " +d);
		}
	}

