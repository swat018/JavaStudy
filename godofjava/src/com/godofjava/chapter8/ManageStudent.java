package com.godofjava.chapter8;

public class ManageStudent {
	public static void main(String[] args) {
		Student student[] = null;
		ManageStudent sample = new ManageStudent();
		student = sample.addStudent();
		sample.printStudents(student);
		
	}
	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook","Seoul","01012345678","ask@godofjava.com");
		return student;
	}
	public void printStudents(Student[] student) {
		for(Student data:student) {
			System.out.println(data);
		}
	}
}
