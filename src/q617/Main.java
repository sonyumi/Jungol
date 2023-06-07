package q617;

import java.util.Scanner;

abstract class Person {
	protected String name = "";
	protected int height = 0;

	protected abstract void height(int height);
	protected abstract void name(String name);
}

class PersonInfo extends Person {

	public void setHeight(int height) {
		if (height > 0) {
			this.height = height;
		} else {
			System.out.println("사람의 키는 0보다 작을 수 없어요.");
		}
	}

	public void setName(String name) {
		this.name = name;
	}
}

public class Main {
	public static void MinArrayPrint(PersonInfo[] personInfo) {
		PersonInfo min = personInfo[0];
		for (int i = 0; i < personInfo.length; i++) {
			if (min.height > personInfo[i].height) {
				min = personInfo[i];
			}
		}
		System.out.println(min.name + " " + min.height);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PersonInfo[] personInfo = new PersonInfo[5];
		for (int i = 0; i < personInfo.length; i++) {
			personInfo[i] = new PersonInfo();
			personInfo[i].setName(sc.next());
			personInfo[i].setHeight(sc.nextInt());
		}
		sc.close();

		MinArrayPrint(personInfo);
	}
}
