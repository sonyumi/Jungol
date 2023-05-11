package q540;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			int n = sc.nextInt();
			if (n % 3 == 0) {
				System.out.println(n / 3);
			} else if (n == -1) {
				sc.close();
				break;
			}
		}
	}
}
