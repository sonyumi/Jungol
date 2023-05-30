package q126;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		int odd = 0;
		int even = 0;
		while (b) {
			int n = sc.nextInt();
			if (n > 0) {
				if (n % 2 != 0) {
					odd++;
				} else {
					even++;
				}
			} else {
				sc.close();
				b = false;
			}
		}
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);
	}

}
