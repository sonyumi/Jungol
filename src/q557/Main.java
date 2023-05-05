package q557;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] b = new char[10]; 

		for(int i = 0 ; i < b.length;i++) {
			char a = sc.next().charAt(0);
			b[i]+=a;
		}
		System.out.print(b[0]+" "+b[3]+" "+b[6]);
	}
}
