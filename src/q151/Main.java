package q151;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int[] a = new int[5];
		while (i < 5) {
			a[i] = sc.nextInt();
			i++;
		}
		System.out.println(a[0] + a[2] + a[4]);

	}
}
