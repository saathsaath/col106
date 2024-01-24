public class program {
	public int test(int n, int m) {
		int ans = n;
		if (gcd(n, m) == 1) {

			ans = ans * m;

		} else {

			while (ans % n != 0 && ans % m != 0) {
				ans = ans * (gcd(n, m));
			}

		}
		return ans;

	}

	public static int gcd(int a, int b) {
		if (a == 0) {
			return b;

		} else if (b == 0) {
			return a;

		} else {
			if (a > b) {
				return gcd(a - b, b);
			} else {
				return gcd(b - a, a);
			}
		}
	}
}


	 

	