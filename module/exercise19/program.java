public class program {
	public String test(String s1, String s2, int m, int n) {
		return (gets1(s1, m) + gets2(s2, n));

	}

	private static String gets1(String s1, int m) {
		String ans1 = "";
		if ((m < s1.length()) && m >= 0) {
			String ans = s1.substring(m);
			return ans;
		} else {
			System.out.println("invalid input");
			return ans1;
		}

	}

	private static String gets2(String s2, int n) {
		String ans2 = "";
		if ((n < s2.length()) && n >= 0) {
			String ans = s2.substring(0, n + 1);
			return ans;
		} else {
			System.out.println("invalid input");
			return ans2;
		}

	}
}
