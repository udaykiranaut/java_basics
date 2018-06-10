package enhancedFor;

public class ForDemo1 
{
	int a[] = {10,20,30,40,50};
	void normalFor()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The element are " +a[i]);
		}
		
	}
	void EnhancedFor()
	{
		for(int x:a)
		{
			System.out.println("Elements are " +x);
		}
		
	}
	public static void main(String[] args) 
	{
		ForDemo1 fd1 = new ForDemo1();
		fd1.normalFor();
		fd1.EnhancedFor();

	}

}
