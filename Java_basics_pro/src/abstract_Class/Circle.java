package abstract_Class;

public class Circle extends Figure 
{

	void area()
	{
		System.out.println("Please enter radious value ");
		float r = Float.parseFloat(scan.nextLine());
		float area = 3.14f*r*r;
		System.out.println("The Radious is " +r);
		System.out.println("The Area of Circle is " +area);
	}
	
}
