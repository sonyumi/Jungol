package q562;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iArr = new int[10];
		int sum = 0;
		int sum1 = 0;
		int j = 0;

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = sc.nextInt();
			if ((i + 1) % 2 == 0) {
				sum += iArr[i];
			} else {
				sum1 += iArr[i];
				j++;
			}
		}
		sc.close();
		double avg = (double) sum1 / j;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}
}
