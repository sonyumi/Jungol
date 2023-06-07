package q601_1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		sc.close();
		String stst = st + st;

		for (int i = st.length() - 1; i >= 0; i--) {
			for (int j = i, k = 0; j < j + st.length() - k; j++, k++) {
				System.out.print(stst.charAt(j));
			}
			System.out.println();
		}
	}
}
