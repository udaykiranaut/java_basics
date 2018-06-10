package nameLessObject;

import java.util.Scanner;

public class BankAccount
{	
	int min_bal;
	int TotalAmount;
	String name;
	Scanner s = new Scanner(System.in);
	BankAccount open()
	{
		min_bal=1000;
		System.out.println("please enter account holder name" );
		
		name = s.next();
		//System.out.println("Account opened" );
		return this;
	}
	int deposit()
	{ 
		int d;
		System.out.println("Please enter the amount to be deposited  ");
		d=s.nextInt();
		TotalAmount = min_bal+d;
		System.out.println("The Account Holder Name is " +name );
		System.out.println("The amount in account after deposit is " +TotalAmount);
		withDraw();
		return TotalAmount;	
	}
	
	int withDraw()
	{
		int e;
		System.out.println("please enter the amount to be withdrawn");
		e=s.nextInt();
		if(e<TotalAmount) 
		{
		TotalAmount = TotalAmount-e;
		System.out.println("Amount after withdrawl  " +TotalAmount );
		}else 
		{
			System.out.println("Insufficient amount");
			
		}
		
		balance();
		return TotalAmount;
	}
	BankAccount balance()
	{
		
		System.out.println("The available balance is " +TotalAmount);
		return this;
	}

	public static void main(String[] args) 
	{	
		
		/*BankAccount ba = new BankAccount();//Named Object
		ba.open();
		ba.deposit();
		ba.withDraw();
		ba.balance();*/
		new BankAccount().open().deposit(); //Nameless Object
	}
}
