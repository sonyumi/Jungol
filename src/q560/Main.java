package q560;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n= new int[10];
		for(int i =0;i<n.length;i++) {
			n[i]= sc.nextInt();
		}
		int min=n[0];
		
		for(int i =0;i<n.length;i++) {
			if(min>n[i]) {
				min=n[i];
			}
		}
		sc.close();
		System.out.print(min);
	}
}
