package q600;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		String[] sArr = s.split(" ");
		System.out.println(sArr.length);

	}
}
