package q539;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = 1;
		int a = 0;
		while(true) {
//			c++;
			int b = sc.nextInt();
			a+=b;
			if(b >= 100) 
				break;
			c++;
			}
		sc.close();
		double avr = (double)a/c;
		System.out.println(a);
		System.out.printf("%.1f",avr);
	}
}
