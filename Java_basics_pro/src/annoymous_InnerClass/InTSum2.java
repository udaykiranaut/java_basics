package annoymous_InnerClass;

public class InTSum2 
{

	public static void main(String[] args) 
	{
	System.out.println("String Cancatination");
	Sum ss = new Sum()
			{
		public void add()
		{
			System.out.println("Enter Two Strings");
			String s1 = scan.nextLine();
			String s2 = scan.nextLine();
			String s3 =s1+" "+s2;
			System.out.println("String sum is " +s3);
		}
			};
			ss.add();
			System.out.println("Float Sum");
			Sum fs = new Sum()
				{ float f3;
				public void add()
				{
					float f1,f2;
					System.out.println("Please enter any two values");
					f1 = scan.nextFloat();
					f2 = scan.nextFloat();
					f3 = f1+f2;
					System.out.println("The sum of two float values is " +f3);
				}
				public void disp()
				{
					System.out.println("float sum is "  +f3);
				}
				};
				fs.add();
				fs.disp();
					
	}
	
}
