package q516;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		char c = sc.next().charAt(0);
		sc.close();
		
		System.out.printf("%.2f%n%.2f%n%c",a,b,c);
	}
}
