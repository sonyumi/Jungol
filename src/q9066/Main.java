package q9066;

public class Main {

	public static void main(String[] args) {
		char[] b = new char[26];
		int c = 90;

		for (int i = b.length - 1; i >= 0; i--) {
			b[i] = (char) c--;
			System.out.print(b[i] + " ");
		}

//		char[] a = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
//		for(int i=25;i>=0;i--) {
//			System.out.print(a[i] + " ");
//		}
	}
}
