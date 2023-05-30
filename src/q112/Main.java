package q112;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		System.out.println(n+" / "+m+" = "+(n/m)+"..."+(n%m));
	}
}
