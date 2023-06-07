package q600;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	<<StringTokenizer 이용>>

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();

		String[] sArr = s.split(" ");
		System.out.println(sArr.length);

		// StringTokenizer 이용 ----------------
		StringTokenizer st = new StringTokenizer(s);
		int n = st.countTokens();
		System.out.println(n);

		while (st.hasMoreTokens()) { // 다음 토큰이 있는지 boolean 타입으로 반환
			String token = st.nextToken(); // 포인터가 다음을 가리킴
			System.out.println(token); // 현재 포인터에 있는 문자열 print. 반복문이라 토큰없을때까지 반복
		}

	}
}
