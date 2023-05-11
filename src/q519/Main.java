package q519;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		System.out.print(a + 100 +" "); //  ==   n1+=100;
		System.out.println(b%10);     //    ==   n2%10;
	}
}
