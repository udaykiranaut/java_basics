package thisDemo;

public class ThisObject2 
{
	int a,b;
	ThisObject2(int a,int b)
	{
		this.a=a+1;
		this.b=b+1;
		System.out.println("formal parameters values are --- " +a +"---" +b);
		System.out.println("data members values are ----" +this.a +"----" +this.b);
	}
	ThisObject2(ThisObject2 t2)
	{
		this.a=t2.a;
		this.b=t2.b;
		System.out.println("The value of a and b is -- " +t2.a +"  " +t2.b);
		this.a=this.a+1;
		this.b=this.b+1;
		System.out.println("The value of a and b is -- " +this.a +"  " +this.b);
		
	}
	ThisObject2(ThisObject2 p1 , ThisObject2 p2)
	{
		
		System.out.println("The value of a and b is  " +p1.a +"   " +p1.b);
		System.out.println("The value of a and b is  " +p2.a +"   " +p2.b);
		this.a=p2.a+1;
		this.b=p2.b+1;
		System.out.println("The value of a and b is -- " +this.a +"  " +this.b);
		
	}
	
	public static void main(String[] args) 
	{
		ThisObject2 o1 = new ThisObject2(10,20);
		ThisObject2 o2 = new ThisObject2(o1);
		ThisObject2 o3 = new ThisObject2(o1,o2);
	}

}
