package methodsDemo;

public class OverRiddenMethod 
{

	double area(double d)
	{
		double s = d*d;
		System.out.println("The area of square is --" +s);
		return s;
	}
	int area(int l ,int b)
	{
		
		int a = 2*(l+b);
		System.out.println("The are of rectangle is ---" +a);
		return a;
	}
	public static void main(String[] args) 
	{
		OverRiddenMethod r1 = new OverRiddenMethod();
		r1.area(2);
		r1.area(2, 4);

	}

}
