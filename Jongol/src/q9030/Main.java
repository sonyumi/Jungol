package q9030;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		sc.close();
		
		System.out.println(score);
		if(10 < score) {
			System.out.print("10보다 큰 수를 입력하셨습니다.");
		}
	}
}
