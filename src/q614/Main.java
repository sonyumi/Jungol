package q614;

import java.util.Scanner;

class Student {
	String school = "";
	int grade = 0;

	Student() {

	}

	Student(String s, int g) {
		school = s;
		grade = g;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String school = sc.next();
		int grade = sc.nextInt();
		sc.close();
		Student stu = new Student("Jejuelementary", 6);
		Student stu2 = new Student(school, grade);
		System.out.println(stu.grade + " grade in " + stu.school + " School");
		System.out.println(stu2.grade + " grade in " + stu2.school + " School");

	}

}
