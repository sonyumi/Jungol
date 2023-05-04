package q9043;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int b = 0;
		int c = 0;
		
		for (;;) {
			int a = sc.nextInt();
			if (a % 2 != 0) {
				b += a;
				c++;
			} else if (a == 0) {
				sc.close();
				break;
			}
		}

		System.out.println("홀수의 합 = " + b);
		System.out.println("홀수의 평균 = " + (b / c));
	}
}
