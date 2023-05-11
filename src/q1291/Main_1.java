package q1291;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			int iS = sc.nextInt();
			int iE = sc.nextInt();

			if (iS < 2 || iS > 9 || iE < 2 || iE > 9) {
				System.out.println("INPUT ERROR!");
				continue;
			} else if (iS > iE) {
				int iC = iS - iE + 1;
				for (int i = 1; i <= 9; i++) {
					int x = iS;
					for (int j = 1; j <= iC; j++) {
						System.out.printf("%d * %d = %2d   ", x, i, x * i);
						x--;
					}
					System.out.println();
				}
			} else {
				int iC = iE - iS + 1;
				for (int i = 1; i <= 9; i++) {
					int x = iS;
					for (int j = 1; j <= iC; j++) {
						System.out.printf("%d * %d = %2d   ", x, i, x * i);
						x++;
					}
					System.out.println();
				}
			}
			sc.close();
			break;

		}

	}

}