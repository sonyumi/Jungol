package q127;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		int sum = 0;
		int count = 0;
		while (b) {
			int n = sc.nextInt();
			if (n >= 0 && n <= 100) {
				sum += n;
				count++;
			} else {
				sc.close();
				b = false;
			}
		}
		double avg = (double) sum / count;
		System.out.println("sum : " + sum);
		System.out.printf("avg : %.1f", avg);
	}
}
