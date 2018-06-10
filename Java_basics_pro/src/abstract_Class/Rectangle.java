package abstract_Class;

public class Rectangle extends Figure
{
	void area()
	{
		float length,breadth,area;
		System.out.println("Please enter lenght and breadth values ");
		length = scan.nextFloat();
		breadth= scan.nextFloat();
		area = length*breadth;
		System.out.println("The Are of a rectangle is " +area);
	}

}
