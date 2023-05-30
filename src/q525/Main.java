package q525;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iArr[] = new int[3];
		
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = sc.nextInt();
		}	
		sc.close();
		
		boolean bA = iArr[0] > iArr[1] && iArr[0] > iArr[2];
		boolean bB = iArr[0] == iArr[1] && iArr[1] == iArr[2];

		System.out.print(bA + " " + bB);
	}
}
