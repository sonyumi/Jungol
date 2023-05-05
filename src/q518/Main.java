package q518;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] num = new int[3];
		int sum = 0;
		int n = 0;
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
			n++;
			sum += num[i];
		}
		System.out.println("sum : " + sum);
		System.out.println("avg : " + (sum / n));
	}
}
