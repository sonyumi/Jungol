package q523;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int iA = sc.nextInt();
		int iB = sc.nextInt();
		sc.close();

//		if (iA > iB) {
//			System.out.println(iA + " > " + iB + " --- " + "1");
//		} else if (iA <= iB) {
//			System.out.println(iA + " > " + iB + " --- " + "0");
//		}
//		
//		if (iA >= iB) {
//			System.out.println(iA + " < " + iB + " --- " + "0");
//		} else if (iA < iB) {
//			System.out.println(iA + " < " + iB + " --- " + "1");
//		}
//
//		if (iA >= iB) {
//			System.out.println(iA + " >= " + iB + " --- " + "1");
//		} else if (iA < iB) {
//			System.out.println(iA + " >= " + iB + " --- " + "0");
//		}
//
//		if (iA > iB) {
//			System.out.println(iA + " <= " + iB + " --- " + "0");
//		} else if (iA <= iB) {
//			System.out.println(iA + " <= " + iB + " --- " + "1");
//		}
		
		//선생님 풀이1
		
		System.out.println(iA+" > "+iB+" --- "+(iA>iB));
		System.out.println(iA+" < "+iB+" --- "+(iA<iB));
		System.out.println(iA+" >= "+iB+" --- "+(iA>=iB));
		System.out.println(iA+" <= "+iB+" --- "+(iA<=iB));
		
		//선생님 풀이2

		System.out.print(iA+" > "+iB+" --- ");
		boolean b = (iA>iB) ? true : false;
		System.out.println(b);
			
		}
	}
}
