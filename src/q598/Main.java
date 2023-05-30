package q598;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (;;) {
			char cA = sc.next().charAt(0);
			if (cA >= '0' && cA <= '9') {
				System.out.println((int) cA);
			} else if (cA >= 'A' && cA <= 'Z' || cA >= 'a' && cA <= 'z') {
				System.out.println(cA);
			} else {
				sc.close();
				break;
			}
		}
		
		// 선생님 풀이 ** 새로운 메소드 **
		while (true) {
			char cA = sc.next().charAt(0);

			if (Character.isAlphabetic(cA)) {
				System.out.println(cA);
			} else if (Character.isDigit(cA)) {
				System.out.println((int) cA);
			} else {
				sc.close();
				break;
			}
		}
	}
}
