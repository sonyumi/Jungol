package q128;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		for (;;) {
			int i = sc.nextInt();
			if (i != 0) {
				if (i % 3 != 0 && i % 5 != 0) {
					count++;
				}
			} else {
				sc.close();
				break;
			}
		}
		System.out.println(count);
	}

}
