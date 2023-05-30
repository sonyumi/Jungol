package q9063;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iArr=new int[5];
		
		for(int i = 0;i<iArr.length;i++) {
			iArr[i]=sc.nextInt();
			System.out.print(iArr[i]+" ");
		}
		sc.close();
	}
}
