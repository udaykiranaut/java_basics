package commandLine;

public class Cmd_line1
{

	public static void main(String k[] ) 
	{
		
		System.out.println("Number of command line arugements are " +k.length);
		for(int i =0;i<k.length;i++)
		{
			System.out.println("The command line arguments at index " +i +" are " +k[i]);
		}
		System.out.println(k[0]+k[2]);
		int v1,v2,v3;
		v1 = Integer.parseInt(k[0]);
		v2 = Integer.parseInt(k[2]);
		v3 = v1+v2;
		System.out.println("The sum is  " +v3);
		
	}

}
