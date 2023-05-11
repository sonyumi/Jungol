package q1291;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int a = sc.nextInt();
			int b = sc.nextInt();

			if (a > b && a <= 9 && b > 1) {
				for (int j = 1; j <= 9; j++) {
					for (int i = a; i >= b; i--) {
						System.out.print(i + " * " + j + " = ");
						System.out.printf("%2d", (i * j));
						System.out.print("   ");
					}
					System.out.println();
				}
				sc.close();
				break;
			} else if (a < b && b <= 9 && a > 1) {
				for (int j = 1; j <= 9; j++) {
					for (int i = a; i <= b; i++) {
						System.out.print(i + " * " + j + " = ");
						System.out.printf("%2d", (i * j));
						System.out.print("   ");
					}
					System.out.println();
				}
				sc.close();
				break;
			} else if (a == b && a > 1 && b > 1 && a <= 9 && b <= 9) {
				for (int j = 1; j <= 9; j++) {
					System.out.printf("%d * %d = %2d\n", b, j, (b * j));
				}
				sc.close();
				break;
			} else {
				System.out.println("INPUT ERROR!");
			}
		}
	}
}