package q9016;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요. ");
		double a = sc.nextDouble();
		System.out.print("몸무게를 입력하세요. ");
		double b = sc.nextDouble();
		System.out.print("이름을 입력하세요. ");
		char c = sc.next().charAt(0);
		System.out.printf("키 = %.0f\n",a);
		System.out.printf("몸무게 = %.1f\n", b);
		System.out.println("이름 = " + c);
		sc.close();
	}
}
