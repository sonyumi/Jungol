package q110;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("yard? ");
		double a = sc.nextDouble();
		sc.close();
		System.out.print(a+"yard = ");
		System.out.printf("%.1fcm", (a * 91.44));
	}
}
