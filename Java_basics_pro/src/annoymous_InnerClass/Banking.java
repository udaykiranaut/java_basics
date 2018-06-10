package annoymous_InnerClass;

public interface Banking 
{
	void open();
	void deposit();
	void withDraw();
	default void loan()
	{
		
	}

}
