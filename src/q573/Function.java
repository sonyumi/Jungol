package q573;

public class Function {
	int n;

	Function() {
		n = 0;
	}

	public void setloop(int n) {
		this.n = n;
	}

	public void getloop() {
		int j = 1;
		for (int i = 1; i <= n; i++) {
			for (; j <= n * i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
