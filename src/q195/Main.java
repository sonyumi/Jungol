package q195;

import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String tel = sc.next();
		String add = sc.next();
		sc.close();

		Network net = new Network();
		
		net.setName(name);
		net.setTel(tel);
		net.setAdd(add);

		System.out.println("name : " + net.getName());
		System.out.println("tel : " + net.getTel());
		System.out.println("addr : " + net.getAdd());
	}
}
