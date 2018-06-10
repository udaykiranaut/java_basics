package Basics_Pk;

public class FirstClassDemo {
int x=90;
int y=100;
	public static void main(String[] args) {
		System.out.println("Starting of the program");
		FirstClassDemo obj1 = new FirstClassDemo();
		obj1.sum();
		System.out.println("The value of x is " +obj1.x);
		System.out.println("The value if y is " +obj1.y);
		FirstClassDemo obj2 = new FirstClassDemo();
		obj2.sum();
		System.out.println("The value of x is "+obj2.x);
		System.out.println("The value of y is" +obj2.y);
		System.out.println("End of the program");
		  } 
	public void sum() {
		int a =90;
		int b=100;
		int c=b+a;
		System.out.println("sum of two numbers is "+c);
	}
}
