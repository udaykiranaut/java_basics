package constructor;

public class Triple 
{
	int a,b,c;
	Triple(int x,int y,int z)
	{
		a=x;
		b=y;
		c=y;
		System.out.println("The value of a " +a);
		System.out.println("The value of b " +b);
		System.out.println("The value of c " +c);
		System.out.println("-------------------");	
	}
	public static void main(String[] args)
	{
		Triple p1 = new Triple(1,2,3);
		Triple p2 = new Triple(10, 20,30);
		Triple p3 = new Triple(100, 200,300);
		Triple p4 = new Triple(1000, 2000,3000);
		
	

	}

}
