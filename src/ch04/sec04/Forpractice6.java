package ch04.sec04;

public class Forpractice6 {
	public static void main(String[] args) {
		String result = "";
		for(int i = 1; i<=5; i++) {
			result += i;
			String str1 = result.replace(i,"*");
			System.out.println(str1);
		}
	}
}
