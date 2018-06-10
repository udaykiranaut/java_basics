package class_Object;

import java.awt.GraphicsEnvironment;

public class FontList 
{
	public void fontList()
	{
	GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	String f[] = ge.getAvailableFontFamilyNames();
	System.out.println("-----------------------");
	System.out.println(f.length);
	System.out.println("-----------------------");
	System.out.println("The Font list is ");
	for(int i=0;i<f.length;i++)
	{
		System.out.println(f[i]);
	}
	}
	
	public static void main(String[] args) 
	{
		FontList fl = new FontList();
		fl.fontList();
	

	}

}
