package q111;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] iArr=new int[4];
		int sum=0;
		int avg=0;
		for(int i = 0;i<4;i++) {
			iArr[i]=sc.nextInt();
			sum+=iArr[i];
		}
		avg = sum/iArr.length;
		System.out.println("sum "+sum);
		System.out.println("avg "+avg);
	}
}
