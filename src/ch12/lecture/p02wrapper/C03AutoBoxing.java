package ch12.lecture.p02wrapper;

public class C03AutoBoxing {
	public static void main(String[] args) {
		Byte b = 3;
		Short s = 20000;
		Integer i = 200000;
		Long l = 99L; //99는 그냥 쓰면 Integer니까 오류 발생, 숫자 뒤에 L써주기
		Float f = 3.14F; //숫자 뒤에 F써주기
		Double d = 3.14;
		Character c = '가';
		Boolean bool = true;
		
		//Object는 루트, 다 됨
		Object o1 = b;
		Object o2 = bool;
		
		Object o3 = true;
	}
}
