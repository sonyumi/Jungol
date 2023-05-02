package q529;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cm = sc.nextInt();
		int weight = sc.nextInt();
		int b = (weight + 100) - cm;
		System.out.println(b);
		sc.close();
		
		if (b > 0) {
			System.out.print("Obesity");
		}
	}
}
