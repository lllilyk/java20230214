package ch03.sec07;

public class LogicalOperatorExample {
	public static void main(String[] args) {
//		int charCode = 'A';
//		int charCode = 'a';
		int charCode = '0';
		
		
		if ((65 <= charCode) && (charCode <= 90)) {
			System.out.println("대문자군요.");
		}
		
		if (('A' <= charCode) && (charCode <= 'Z')) {
			System.out.println("대문자군요.");
		}
		
		if ((97 <= charCode) && (charCode <= 122)) { //첫번째 조건이 FALSE 65는 122보다 작으니까 두번째 조건은 TRUE
			System.out.println("소문자군요.");//FALSE AND TRUE기 때문에 결과가 출력X
		}
		
		if (('a' <= charCode) && (charCode <= 'z')) {
			System.out.println("소문자군요.");
		}
		
		if ((48 <= charCode) && (charCode <= 57)) {
			System.out.println("0~9 숫자이군요.");
		}
		
		if (('0' <= charCode) && (charCode <= '9')) { //숫자도 고유 코드를 가지고 있음
			System.out.println("0~9 숫자이군요.");
		}
		
//		int value = 6;
		int value = 7;
		
		if ((value % 2 == 0) || (value % 3 == 0)) {
			System.out.println("2 또는 3의 배수이군요.");
		}
		
		boolean result = (value % 2 == 0) || (value % 3 == 0);
		
		if (!result) {
			System.out.println("2 또는 3의 배수가 아니군요.");
		} //1:30:00
	}
}
