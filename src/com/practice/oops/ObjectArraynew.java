package com.practice.oops;

class Student {
	int reg;
	String name;
	int marks;

}

public class ObjectArraynew {
	public static void main(String[] args) {

		Student s1 = new Student();
		s1.reg = 21;
		s1.name = " Aj";
		s1.marks = 78;

		Student s2 = new Student();
		s2.reg = 23;
		s2.name = " Ay";
		s2.marks = 88;

		Student s3 = new Student();
		s3.reg = 22;
		s3.name = " Ajay";
		s3.marks = 98;

		Student[] stu = new Student[3];
		stu[0] = s1;
		stu[1] = s2;
		stu[2] = s3;

		System.out.println("For loop : ");
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].reg + " : " + stu[i].name + " : " + stu[i].marks);
		}
		
		
		System.out.println("\nEnhanced for loop : ");
		for (Student a : stu) {
			System.out.println(a.reg + " : " + a.name + " : " + a.marks);
		}
	}

}
