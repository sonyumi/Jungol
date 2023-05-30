package q563;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iArr = new int[10];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] += sc.nextInt();
		}
		sc.close();

		for (int i = 0; i < iArr.length; i++) {
			int max = Integer.MIN_VALUE;
			int index = 0;
			int nul = 0;
			for (int j = iArr.length-1; j >= i; j--) {
				if (max < iArr[j]) {
					max = iArr[j];
					index = j;
				}
			}		
			nul=iArr[i];
			iArr[i] = max;
			iArr[index]=nul;
			max = Integer.MIN_VALUE;
		}
		for(int i = 0;i<iArr.length;i++) {
			System.out.print(iArr[i]+" ");
		}
	}
}
