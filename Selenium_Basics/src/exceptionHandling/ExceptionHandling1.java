package exceptionHandling;

public class ExceptionHandling1 {

	public static void main(String[] args) {
		System.out.println("start");
		try 
		{
		int c = 10/0;
		System.out.println("the value of c is " +c);
		}
		catch(ArithmeticException e )
		{
			System.out.println("Something is wrong in division i.e " +e.getMessage());
			System.out.println("please enter proper values");
		}
		System.out.println("end");
		}
	}
