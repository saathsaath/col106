public class program {
	public static int[][] test(int M1[][], int M2[][]) {
		int m1row = M1.length;
		int m1col = M1[0].length;
		int m2row = M2.length;
		int m2col = M2[0].length;
		int[][] ans = new int[m1row][m1col];

		if (m1row != m2row || m1col != m2col) {
			System.out.println("invalid input");
		} else {
			for (int i = 0; i < m1row; i++) {
				for (int j = 0; j < m1col; j++) {
					ans[i][j] = M1[i][j] + M2[i][j];

				}
			}
		}

		return ans;

	}
}
