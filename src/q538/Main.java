package q538;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int a = sc.nextInt();
			System.out.print("number? ");
			if (a > 0) {
				System.out.println("positive integer");
			} else if (a < 0) {
				System.out.println("negative number");
			} else {
				break;
			}
		}
		sc.close();
	}
}
