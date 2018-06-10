package commandLine;

public class Sum 
{
	void accept(int k,int l)
	{
		int z=k+l;
		System.out.println("the of command arguments is " +z);
	}

	public static void main(String s[])
	{
		int x,y;
		x=Integer.parseInt(s[0]);
		y=Integer.parseInt(s[1]);
		Sum s1 = new Sum();
		s1.accept(x, y);
	}

}
