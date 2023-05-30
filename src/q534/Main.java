package q534;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char n = sc.next().charAt(0);
		sc.close();

		if (n == 'A') {
			System.out.println("Excellent");
		} else if (n == 'B') {
			System.out.println("Good");
		} else if (n == 'C') {
			System.out.println("Usually");
		} else if (n == 'D') {
			System.out.println("Effort");
		} else if (n == 'F') {
			System.out.println("Failure");
		} else {
			System.out.println("error");
		}

//		switch (n) {
//		case 'A':
//			System.out.println("Excellent");
//			break;
//		case 'B':
//			System.out.println("Good");
//			break;
//		case 'C':
//			System.out.println("Usually");
//			break;
//		case 'D':
//			System.out.println("Effort");
//			break;
//		case 'F':
//			System.out.println("Failure");
//			break;
//		default :
//			System.out.println("error");
//			break;
//		}
	}
}
