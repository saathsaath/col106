public class program {
	public float[] test(int b, int c) {

		int root = (b * b - 4 * c);
		double s1 = (-b - Math.sqrt(root)) / (2);
		double s2 = (-b + Math.sqrt(root)) / (2);
		float sol1 = (float) s1;
		float sol2 = (float) s2;

		float[] solution = { sol1, sol2 };

		return solution;

	}
}
