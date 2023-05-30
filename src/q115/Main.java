package q115;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[4];
		for (int i = 0; i < 4; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();
		boolean b = a[0] > a[2] && a[1] > a[3];

		System.out.println(b);
	}
}
