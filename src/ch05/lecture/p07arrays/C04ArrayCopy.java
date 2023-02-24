package ch05.lecture.p07arrays;

import java.util.Arrays;

public class C04ArrayCopy {
	public static void main(String[] args) {
		//188쪽
		int[] origin = {1, 3, 4, 5, 7};
		int[] new1 = new int[origin.length];

		System.arraycopy(origin, 0, new1, 0, origin.length);

		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(new1));

		origin[3] = 55;

		System.out.println(Arrays.toString(origin));
		System.out.println(Arrays.toString(new1));
	}
}
