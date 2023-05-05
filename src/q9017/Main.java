package q9017;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 실수를 입력하시오. ");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		sc.close();
		System.out.printf("x = %.2f\n", a);
		System.out.printf("y = %.2f", b);
	}
}
