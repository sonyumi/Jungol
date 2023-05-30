package q561;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[10];
		int max = 0;
		int min = 10000;
		
		for (int i = 0; i < n.length; i++) {
			n[i] = sc.nextInt();
			if (100 > n[i] && 0 < n[i]) {
				max = max < n[i] ? n[i] : max;
			} else {
				min = min > n[i] ? n[i] : min;
			}
		}
		sc.close();
		max = max == 0 ? 100 : max;
		min = min == 10000 ? 100 : min;

		System.out.println(max + " " + min);
	}
}
