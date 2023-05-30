package q572;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		sc.close();
		Pi circle = new Pi();
		
		circle.setRadius(r);
		circle.printf();

	}

}
