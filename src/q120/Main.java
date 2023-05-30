package q120;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int iA=sc.nextInt();
		int iB=sc.nextInt();
		sc.close();
		
		if(iA>iB) {
			System.out.println(iA-iB);
		}else {
			System.out.println(iB-iA);
		}

	}

}
