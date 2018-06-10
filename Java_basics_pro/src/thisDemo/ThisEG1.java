package thisDemo;

public class ThisEG1 
{
	int a,b;
	ThisEG1(int a ,int b)
	{
		this.a=a;
		this.b=b;
		this.a=this.a+1;
		this.b=this.b+1;
		System.out.println("value of formal parameters a is--" +a);
		System.out.println("calue of formal parameters b is--" +b);
	}
	void disp()
	{
		System.out.println(" The value of Data Memebers");
		System.out.println("value of data members a is--" +this.a);
		System.out.println("calue of data members b is--" +this.b);
	}
	

	public static void main(String[] args) 
	{
		ThisEG1 to1 = new ThisEG1(10,20);
		to1.disp();
		ThisEG1 to2 = new ThisEG1(2,4);
		to2.disp();
		
			
	}

}
