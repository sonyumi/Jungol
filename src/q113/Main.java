package q113;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		n=n+5;
		m=m*2;
		int a = n*m;
		System.out.println("width = "+n);
		System.out.println("length = "+m);
		System.out.println("area = "+a);
	}
}
