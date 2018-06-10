package variableArguments;

public class VarargsDemo1 
{
	void disp(int...x)
	{
		for(int a:x)
		{
			System.out.print(a+"\t");
		}
		System.out.println("\n");
		
	}

	public static void main(String[] args) 
	{
		VarargsDemo1 vd1 = new VarargsDemo1();
		vd1.disp(10);
		vd1.disp(10,20);
		vd1.disp(10,20,30);
	

	}

}
