package q575;

import java.util.Scanner;

class Number {
	private int num1, num2;

	public void setNumber(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getPower() {
		int power = 1;
		if (num2 != 0) {
			for (int i = 0; i < num2; i++) {
				power *= num1;
			}
		}
		return power;
	}

}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		sc.close();

		Number num = new Number();

		num.setNumber(num1, num2);

		int power = num.getPower();
		System.out.println(power);
		
	}
}
