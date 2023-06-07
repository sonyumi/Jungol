package q196;

import java.util.Scanner;

class Person {
	private String name;
	private String tel;
	private String addr;
	
	public Person(){
		this.name = "";
		this.tel = "";
		this.addr = "";
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setAddress(String addr) {
		this.addr = addr;
	}
	
	public String getName() {
		return name;
	}
	public String getTel() {
		return tel;
	}
	public String getAddress() {
		return addr;
	}
}

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Person[] pArr = new Person[3];
		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
			pArr[i].setName(sc.next());
			pArr[i].setTel(sc.next());
			pArr[i].setAddress(sc.next());
		}
		sc.close();
		
		for (int k=97,i=65; i <=90 && k<=122; i++,k++) {
			for (int j = 0; j < pArr.length; j++) {
				if (pArr[j].getName().charAt(0) == i || pArr[j].getName().charAt(0) == k) {
					System.out.println("name : " + pArr[j].getName());
					System.out.println("tel : " + pArr[j].getTel());
					System.out.println("addr : " + pArr[j].getAddress());
					i=91;
					k=123;
					break;
				}
			}
		}
	}
}
