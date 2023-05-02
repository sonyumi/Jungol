package q556;

public class Main {

	public static void main(String[] args) {
		int[] a = new int[10];
		int b = 1;
		for (int i = 0; i < a.length; i++) {
			a[i] = b++;
			System.out.print(a[i]);
			if (i < a.length - 1) {
				System.out.print("?");
			}
		}
	}
}
