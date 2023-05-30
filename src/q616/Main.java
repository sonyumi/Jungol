package q616;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		sc.close();
		Triangle tri = new Triangle(x1, y1, x2, y2, x3, y3);
		double dx=tri.getCoGX();
		double dy=tri.getCoGY();
		System.out.printf("(%.1f, %.1f)", dx, dy);
	}
}
