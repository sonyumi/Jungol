package q601;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sA = sc.next();
		sc.close();
		for (int i = sA.length() - 1; i >= 0; i--) {
			for(int j = i;j<sA.length();j++) {
				System.out.print(sA.charAt(j));
			}
			for(int j = 0;j<=i-1;j++) {
				System.out.print(sA.charAt(j));
			}
			System.out.println();
		}
	}
}
