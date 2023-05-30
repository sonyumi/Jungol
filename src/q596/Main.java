package q596;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sA = sc.next();
		int iA = sc.nextInt();
		sc.close();

		if (iA < sA.length()) {
			for (int i = sA.length() - 1; i > (sA.length() - 1) - iA; i--) {
				System.out.print(sA.charAt(i));
			}
		} else {
			for (int i = sA.length() - 1; i >= 0; i--) {
				System.out.print(sA.charAt(i));
			}
		}
	}
}
