package methodsDemo;

public class SimpleInterestHard 
{
		double calculate(double p,double t ,double r)
		{
			double si = (p*t*r)/100;
			System.out.println("The simple interest for the principle ---" +p +"is -- " +si);
			return si;
			
			
		}

	public static void main(String[] args)
	{
		SimpleInterestHard i1 = new SimpleInterestHard();
		i1.calculate(10000, 1, 3.2);

	}

}
