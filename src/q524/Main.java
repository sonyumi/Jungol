package q524;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iA = sc.nextInt();
		int iB = sc.nextInt();
		sc.close();
//		boolean bA = (iA * iB) != 0;
//		boolean bB = (iA + iB) != 0;

//		boolean bA=(iA==0&&iB==0) ? true:false;
		System.out.println(bA);
		System.out.println(bB);

		// 선생님 풀이

		boolean b1 = (iA != 0);
		boolean b2 = (iB != 0);
		System.out.print((b1 && b2) + " " + (b1 || b2));
	}

}
