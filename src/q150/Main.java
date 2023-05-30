package q150;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = "";
		for (int i = 0; i < 10; i++) {
			s += sc.next();
		}
		sc.close();
		for (int i = 9; i >= 0; i--) {
			System.out.print(s.charAt(i) + " ");
		}

	}
}
