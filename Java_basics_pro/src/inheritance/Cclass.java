package inheritance;

public class Cclass extends Bclass
{

	public static void main(String[] args) 
	{
		Cclass cc = new Cclass();
		cc.sub();
		cc.sum();
		Aclass ac = new Aclass();
		ac.sum();
		//This below code line is not possible
		//ac.sub();
		
	}

}
