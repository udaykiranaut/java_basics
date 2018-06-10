package enhancedFor;

public class ForDemo2 
{

	public static void main(String[] args)
	{
		int a[]= {10,100,200,300,400};
		String st[]= {"c","c++","java"};
		for(int y:a)
		{
			System.out.println(y);
		}
		for(String s:st)
		{
			System.out.println(s);
		}	
	}
}
