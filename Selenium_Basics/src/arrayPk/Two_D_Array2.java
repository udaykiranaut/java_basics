package arrayPk;

public class Two_D_Array2 {

	public static void main(String[] args) {
		int school[][] = new int[2][2];
		school[0][0]=23;
		school[0][1]=43;
		school[1][0]=55;
		school[1][1]=76;
		int len = school.length;
		System.out.println("the length of array is " + len);
		
		System.out.println("the value of school is " +school[1][0]);
			
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("The value at index " +"-" +i+j +"-" +school[i][j]);
			}
		}

	}

}
