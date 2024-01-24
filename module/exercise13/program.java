public class program {
	public float test(int numbers[]) {

		double ans = 0;
		if (numbers.length == 0) {
			float ans2 = (float) ans;
			return ans2;
		} else {
			for (int i = 0; i < numbers.length; i++) {

				ans = (ans * i + numbers[i]) / (i + 1);

			}
			float ans2 = (float) ans;
			return ans2;

		}

	}
}
