package q599;

import java.util.Scanner;

public class Main {
	
	public static void upperCase(String sA) {
		
		for (int i = 0; i < sA.length(); i++) {
			if (sA.charAt(i) >= 'A' && sA.charAt(i) <= 'Z') {
				System.out.print(sA.charAt(i));
			} else if (sA.charAt(i) >= 'a' && sA.charAt(i) <= 'z') {
				System.out.print((char) (sA.charAt(i) - 32));
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sA = sc.next();
		sc.close();
		
		upperCase(sA);
	}
}
