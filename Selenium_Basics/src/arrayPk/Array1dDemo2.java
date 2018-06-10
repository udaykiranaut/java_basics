package arrayPk;

public class Array1dDemo2 {

	public static void main(String[] args) {
		int student_id[] = new int[5];
		student_id[0]=12;
		student_id[1]=15;
		student_id[2]=20;
		student_id[3]=35;
		student_id[4]=58;
		
		int size_of_array = student_id.length;
		System.out.println("The length of array " +size_of_array);
		
		for(int i=0;i<size_of_array;i++) {
			System.out.println("The student id is "+student_id[i]);
		}
		
	}

}
