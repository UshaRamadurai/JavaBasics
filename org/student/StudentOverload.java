package org.student;

public class StudentOverload {

	public void getStudentInfo(int id) {

		System.out.println("The Student id is :" + id);
	}

	public void getStudentInfo(int id, String name) {

		System.out.println("The Student id  and name is :" + id + "," + name);
	}

	public void getStudentInfo(String name, int id) {

		System.out.println("The Student id  and name is :" + id + "," + name);
	}

	public void getStudentInfo(String email, long phNumber) {

		System.out.println("The Student email  and Phone number is :" + email + "," + phNumber);
	}

	public static void main(String[] args) {

		StudentOverload stu = new StudentOverload();
		stu.getStudentInfo(345);
		stu.getStudentInfo(345, "Adhiya");
		stu.getStudentInfo( "Adhiya", 46);
		stu.getStudentInfo("adhiya@gmail.com", 8983421311l);
		
	}

}
