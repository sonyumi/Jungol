package q9109;

import java.util.Scanner;

public class Main_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = "";
		while(true) {
			char c = sc.next().charAt(0);
//			String str = sc.next(); 위 문장과 같은 의미
//			char c = str.charAt(0);
//			if(('A' <= c && c <= 'Z')||('a' <= c && c<= 'z')) {
			if(Character.isAlphabetic(c)) {
				str += c;
			}else {
				break;
			}
			System.out.println(str);
		}

	}

}
