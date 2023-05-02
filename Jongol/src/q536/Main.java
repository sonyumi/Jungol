package q536;

public class Main {

	public static void main(String[] args) {
		int sum = 1;

		while (sum <= 15) {
			System.out.print(sum + "?");
			sum++;
			if (sum == 15) {
				System.out.print(sum);
				break;
			}
		}
	}
}
