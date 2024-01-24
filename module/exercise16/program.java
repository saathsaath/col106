public class program {
	public String[] test(String fileNames[]) {

		int njava = 0;
		for (int i = 0; i < fileNames.length; i++) {
			String eachfile = fileNames[i];
			String isitjava = eachfile.substring(eachfile.length() - 5);
			if (isitjava.equals(".java")) {
				njava++;
			}
		}

		String[] ans = new String[njava];
		int ansarray = 0;
		for (int i = 0; i < fileNames.length; i++) {
			String eachfile = fileNames[i];
			String isitjava = eachfile.substring(eachfile.length() - 5);
			if (isitjava.equals(".java")) {
				ans[ansarray] = fileNames[i];
				ansarray++;

			}

		}

		return ans;
	}
}
