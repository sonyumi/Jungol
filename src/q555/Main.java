package q555;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] a = new char[10];
		String b = "";
		for(int i = 0; i < a.length;i++) {
			a[i] = sc.next().charAt(0);
			b+=a[i];
		}
		sc.close();
		System.out.println(b+" ");
	}
}
