package q633;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		for (;;) {
			System.out.println("1. Korea");
			System.out.println("2. USA");
			System.out.println("3. Japan");
			System.out.println("4. China");
			System.out.println("number? ");
			int a = sc.nextInt();
			if (a == 1) {
				System.out.println("\nSeoul\n");
			} else if (a == 2) {
				System.out.println("\nWashington\n");
			} else if (a == 3) {
				System.out.println("\nTokyo\n");
			} else if (a == 4) {
				System.out.println("\nBeijing\n");
			} else {
				System.out.println("\nnone");
				break;
			}

		}
	}
}
