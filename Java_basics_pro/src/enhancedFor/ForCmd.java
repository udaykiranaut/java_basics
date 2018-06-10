package enhancedFor;

public class ForCmd 
{

	public static void main(String[] cmd) 
	{
		for(int i=0;i<cmd.length;i++)
		{
			//System.out.println("The Elements at Index " + i +" is " +cmd[i]);
			System.out.print(cmd[i] +"\t");
			
		}
		System.out.println();
		for(String s:cmd)
		{
			System.out.print(s +"\t");
		}
		

	}

}
