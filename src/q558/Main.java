package q558;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[100];
		int n;
		for (n = 0; n < 100; n++) {
			a[n] = sc.nextInt();
			if (a[n] == 0) {
				sc.close();
				break;
			}
		}
		for (n -= 1; n >= 0; n--) {
			System.out.print(a[n] + " ");
		}
	}
}
