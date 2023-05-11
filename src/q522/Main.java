package q522;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		sc.close();
//		if(a==b) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}
//		if(a!=b) {
//			System.out.println("true");
//		} else {
//			System.out.println("false");
//		}

		int[] inp = new int[2];
		for (int i = 0; i < inp.length; i++) {
			inp[i] = sc.nextInt();
		}
		sc.close();

		if (inp[0] == inp[1]) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		if (inp[0] != inp[1]) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		int res1 = (inp[0] == inp[1]) ? 1 : 0;
		int res2 = (inp[0] != inp[1]) ? 1 : 0;
		
		System.out.println(res1);
		System.out.println(res2);
		
		boolean bS = inp[0]==inp[1];
		System.out.println(bS);
		System.out.println(!bS);
		
	}
}
