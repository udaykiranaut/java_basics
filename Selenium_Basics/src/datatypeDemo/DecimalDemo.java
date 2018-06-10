package datatypeDemo;

public class DecimalDemo {

	public static void main(String[] args) {
		float my_marks=(float)60.88; // type casting from double to float
		
		float my_maths_marks=87.87f; // direct float
		
		double my_new_marks=567.767;
		
		System.out.println("my marks "+my_marks);
		System.out.println("my math marks "+my_maths_marks);
		System.out.println("my new marks "+my_new_marks);
		
		//down casting - - converting from higher data type to lower data type
		int a =(int)49.45;
		System.out.println("the value of int "+ a);
		

	}

}
