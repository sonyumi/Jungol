package q9041;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("점수를 입력하세요. ");
			int a = sc.nextInt();
		if((a<0)||(a>100)) {
			break;
			
		}else if(a >=80) {
			System.out.println("축하합니다. 합격입니다.\n");
			
		}else if(a<80) {
			System.out.println("죄송합니다. 불합격입니다.");
			
		}
		sc.close(); // sc 를 어디서 닫아야 하는지 쌤한테 물어보기!!
		}
		
		}
}
