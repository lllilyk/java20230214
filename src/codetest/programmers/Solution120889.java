package codetest.programmers;

import java.util.Arrays;

public class Solution120889 {
	public static void main(String[] args) {

		int[] sides = { 1, 2, 3 };

		int answer = 0;

		Arrays.sort(sides);

		for (int i = 0; i < sides.length - 1; i++) {
			if (sides[sides.length - 1] < sides[i] + sides[i+1]) {
				System.out.println("1");
			} else {
				System.out.println("2");
			}

		}
	}
}
