package constructor;

public class Double 
{
	int a,b;
	Double(int x,int y)
	{
		a=x;
		b=y;
		System.out.println("The value of a " +a);
		System.out.println("The value of a " +b);
		System.out.println("-------------------");	
	}
	public static void main(String[] args)
	{
		Double p1 = new Double(1,2);
		Double p2 = new Double(10, 20);
		Double p3 = new Double(100, 200);
		Double p4 = new Double(1000, 2000);
		
	

	}

}
