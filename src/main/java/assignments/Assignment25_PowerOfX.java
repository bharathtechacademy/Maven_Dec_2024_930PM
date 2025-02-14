package assignments;

public class Assignment25_PowerOfX {

	public static void main(String[] args) {

		double x = 10;
		int n = -1;
		double result = 1;

		if (n == 0) {
			result = 1;
		}

		if (n < 0) {
			x = 1 / x;
			n = -n;
		}

		for (int i = 0; i < n; i++) {
			result = result * x;
		}
		System.out.println(result);
	}

}
