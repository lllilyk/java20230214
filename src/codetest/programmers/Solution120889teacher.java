package codetest.programmers;

import java.util.Arrays; //import 선언이 class 선언보다 선행되어야 함

public class Solution120889teacher {
	public int solution(int[] sides) {

		Arrays.sort(sides);

		return (sides[0] + sides[1] > sides[2]) ? 1 : 2; //삼항 연산자에 익숙해지기..
	}
}