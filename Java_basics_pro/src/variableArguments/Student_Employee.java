package variableArguments;

public class Student_Employee 
{
	void student(String Student_name,int...marks)
	{
		System.out.println("The student name is " +Student_name);
		System.out.println("The Student marks are ");
		for(int m:marks)
		{
			System.out.print(m +"\t");
		}
		System.out.println();
	}
	void employee(int deptno,String...names)
	{
		System.out.println("The Department no is " +deptno);
		System.out.println("The Employee names are ");
		for(String s:names)
		{
			System.out.print(s+"\t");
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		Student_Employee st = new Student_Employee();
		st.student("uday",50,60,70,80);
		st.student("kiran", 80,90,100,70);
		st.student("krishna", 99,98,97,96);
		st.employee(100, "uday","kiran","krishna");
		Student_Employee ep = new Student_Employee();
		st.employee(110, "uk","usa","germany");
		ep.employee(200, "ku","dubai","singapoor");
		ep.employee(210, "sss","yyyy");
	}
}
