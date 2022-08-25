package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Chakra");
	}

	public void studentDept() {
		System.out.println("Bcom Commerce");
	}
	
	public void studentId() {
		System.out.println("897679");
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		student.collegeName();
		student.collegeCode();
		student.collegeRank();
		student.deptName();
		student.studentName();
		student.studentDept();
		student.studentId();
		
	}
	

}
