package thisDemo;

public class Mul3Objects 
{
	int a,b,c;
	Mul3Objects()
	{
		a=b=c=0;
	}
	Mul3Objects(int a,int b,int c)
	{
		this.a = a+1;
		this.b = b+1;
		this.c = c+1;
		System.out.println(" The values passed are " +a +"---" +b +"---" +c);
		System.out.println("The values after adding 1 are " +this.a +"---" +this.b +"---" +this.c);
	}
	Mul3Objects(Mul3Objects o1 ,Mul3Objects o2 ,Mul3Objects o3)
	{
		int n =o1.a*o1.b*o1.c;
		int m = (o1.a*o1.b*o1.c)*(o2.a*o2.b*o2.c)*(o3.a*o3.b*o3.c);
		
		System.out.println("singke object product ---" +n);
		System.out.println("The product of three objects ----" +m);
		
		
	}
	public static void main(String[] args) 
	{
		Mul3Objects k1 = new Mul3Objects(2,4,6);
		Mul3Objects k2 = new Mul3Objects(k1,k1,k1);
		
	

	}

}
