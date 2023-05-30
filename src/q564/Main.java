package q564;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = "";
		int count = 0;
		for (int k = 0; k < 100; k++) {
			char upper = sc.next().charAt(0);
			if (upper >= 65 && upper <= 90) {
				S += upper;
			} else {
				sc.close();
				break;
			}
		}
		for (int i = 65; i <= 90; i++) {
			for (int j = 0; j < S.length(); j++) {
				if (S.charAt(j) == i) {
					count++;
				}
			}
			if (count != 0) {
				System.out.print((char) i + " : " + count + "\n");
			}
			count = 0;
		}
	}
}
