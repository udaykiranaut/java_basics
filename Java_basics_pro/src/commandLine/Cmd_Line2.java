package commandLine;

public class Cmd_Line2 
{

	public static void main(String[] args) 
	{
		String s[] = {"10" ,"20" ,"30" ,"40","uday","kiran"};
		System.out.println("The length of array is " +s.length);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("The elements at index " +i +" are " +s[i]);
		}
		System.out.println(s[0]+s[1]);
		int x,y,z;
		x=Integer.parseInt(s[2]);
		y=Integer.parseInt(s[3]);
		z=x+y;
		System.out.println(z);
		System.out.println(s[4]+s[5]);
	}

}
