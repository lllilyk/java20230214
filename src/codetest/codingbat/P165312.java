package codetest.codingbat;

public class P165312 {
	public String doubleChar(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			result += str.charAt(i); // T
			result += str.charAt(i); // T
		}

		return result;
	}

}
