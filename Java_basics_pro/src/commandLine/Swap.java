package commandLine;

public class Swap 
{
	int a,b;
	//int temp;
	void swaping(int a, int b)
	{
		this.a=b;
		this.b=a;
		/*temp=a;
		this.a=b;
		this.b=temp;*/
		System.out.println("The orginal values are  " +a  +" and " +b);
		System.out.println("The swaped values are " +this.a +" and " +this.b );
	}

	public static void main(String s[]) 
	{
		if(s.length==2)
		{
			
			int x,y;
			x=Integer.parseInt(s[0]);
			y=Integer.parseInt(s[1]);
			Swap o1 = new Swap();
			o1.swaping(x, y);
		}else
		{
			System.out.println("Please enter only two numberical values");
		}
		

	}

}
