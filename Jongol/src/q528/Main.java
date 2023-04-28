package q528;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		sc.close();
		
		System.out.print(score);
		if (score < 0) {
			System.out.print("\nminus");
		}
	}
}
