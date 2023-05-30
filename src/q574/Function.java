package q574;

public class Function {
	static int[] iArr = new int[3];

	public Function() {
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = 0;
		}
	}

	public void setiArr(int n, int m, int o) {
		iArr[0] = n;
		iArr[1] = m;
		iArr[2] = o;
	}

	public int getMax() {
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < iArr.length; i++) {
			max = iArr[i] > max ? iArr[i] : max;
		}
		return max;
	}

}
