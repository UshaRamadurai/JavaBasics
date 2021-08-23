package org.student;

import org.department.Department;

public class Student extends  Department{
	
	public void studentName() {

		System.out.println("This Student Name is Adhiya");
	}

	public void studentDept() {

		System.out.println("This Student Dept is Medical Science");
	}
	public void studentId() {

		System.out.println("This Student Id is Adhiya001");
	}
	
	
	public static void main(String[] args) {
		Student obj1 = new Student();
		obj1.collegeCode();
		obj1.collegeName();
		obj1.collegeRank();
		obj1.deptName();
		obj1.studentDept();
		obj1.studentId();
		obj1.studentName();
	}
}
