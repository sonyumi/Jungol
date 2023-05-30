package q152;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] a = new int[10];
		int odd = 0;
		int even = 0;
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
			if (i % 2 == 0) {
				odd += a[i];
			} else {
				even += a[i];
			}
		}
		sc.close();
		System.out.println("odd : " + odd);
		System.out.println("even : " + even);

	}
}
