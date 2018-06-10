package constructor;

public class Both 
{
	int a,b,c;
	Both()
	{
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		System.out.println("The value of c is " +c);
		System.out.println("---------------------");
		
	}
	Both(int x,int y,int z)
	{
		a=x;
		b=y;
		c=z;
		System.out.println("The value of a is " +a);
		System.out.println("The value of b is " +b);
		System.out.println("The value of c is " +c);
		System.out.println("---------------------");
	}
	public static void main(String[] args) 
	{
		Both d1 = new Both();
		Both d2 = new Both();
		Both p1 = new Both(1,2,3);
		Both p2 = new Both(10,20,30);
	}
}
