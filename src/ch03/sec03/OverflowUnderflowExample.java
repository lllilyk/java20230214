package ch03.sec03;

public class OverflowUnderflowExample {
	public static void main(String[] args) {
// 이런식으로 연산할 때 범위를 벗어날 수 있으니 처음에 타입 선택부터 잘하기
		byte var1 =125;
		for (int i = 0; i < 5 ; i++) {
			var1++;
			System.out.println("var1: " + var1);
		} //overflow 발생
		
		System.out.println("-----------------------");
		
		byte var2 = -125;
		for (int i = 0; i < 5; i++) {
			var2--;
			System.out.println("var2: " + var2);
		} //underflow 발생
	}
}
