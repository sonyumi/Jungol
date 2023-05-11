package q533;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char u = sc.next().charAt(0);
		int a = sc.nextInt();
		sc.close();
		if (u == 'M' && a >= 18) {
			System.out.print("MAN");
		} else if (u == 'M' && a < 18) {
			System.out.print("BOY");
		} else if (u == 'F' && a >= 18) {
			System.out.print("WOMAN");
		} else {
			System.out.print("GIRL");
		}
	}
}
