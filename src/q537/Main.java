package q537;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int in = sc.nextInt();
		sc.close();
		
		int sum = 0;
		int i = 0;
		while (i <= 100) {
			i++;
			sum += i;
			if (i == in) {
				System.out.println(sum);
			}
		}
	}
}
//		int sum3 = 0;
//		int i3 = 0;
//		do {
//			sum3+=i3++;
//		}while(i3 <=in);
//	}
//	System.out.pirntln(sum3);
