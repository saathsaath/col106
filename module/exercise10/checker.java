public class checker {
	public static void main(String args[]) {
		int inputs[][] = { { 0, 10 }, { 3, 13 }, { 3, 14 } };
		boolean outputs[] = { true, true, false };

		for (int i = 0; i < inputs.length; i++) {

			boolean oracle_output = outputs[i];

			program p = new program();

			boolean output = p.test(inputs[i][0], inputs[i][1]);
			if (output == oracle_output) {
				System.out.println("test passed for " + input_a + "," + input_b);
			} else {
				System.out.println("test failed for " + input_a + "," + input_b);
			}
		}
	}
}
