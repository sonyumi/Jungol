package q613;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		Student Stu1 = new Student();
//		Student[] Stu2 = new Student[2];
//		for(int i =0;i<Stu2.length;i++) {
//			Stu2[i] = new Student();
//			Stu2[i].name=sc.next();
//			Stu2[i].school=sc.next();
//			Stu2[i].grade=sc.nextInt();
//		}
//		
//		for(int i =0;i<Stu2.length;i++) {
//			System.out.println("Name : " + Stu2[i].name);
//			System.out.println("School : " + Stu2[i].school);
//			System.out.println("Grade : " + Stu2[i].grade);
//		}
		
		Student[] stu = new Student[2];
				
		for(int i =0;i<stu.length;i++) {
			String name = sc.next();
			String school = sc.next();
			int grade =sc.nextInt();
			stu[i]=new Student(name, school, grade);
			System.out.println("Name : " + stu[i].name);
			System.out.println("School : " + stu[i].school);
			System.out.println("Grade : " + stu[i].grade);
		}
		
		
	
		String name = sc.next();
		String school = sc.next();
		int grade =sc.nextInt();
	
		Student Stu = new Student(name, school, grade);
		
		System.out.println("Name : " + Stu.name);
		System.out.println("School : " + Stu.school);
		System.out.println("Grade : " + Stu.grade);
		
		name = sc.next();
		school = sc.next();
		grade =sc.nextInt();
		
		Student Stu2 = new Student(name, school, grade);
	
		System.out.println("Name : " + Stu2.name);
		System.out.println("School : " + Stu2.school);
		System.out.println("Grade : " + Stu2.grade);
	


	}

}
