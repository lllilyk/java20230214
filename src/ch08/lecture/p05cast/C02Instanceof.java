package ch08.lecture.p05cast;

public class C02Instanceof {
	public static void main(String[] args) {
		MyInterface02 o1 = new MyClass021();
		MyInterface02 o2 = new MyClass022();
	
		/*
		//강제형변환 가능
		MyClass021 o3 = (MyClass021) o1;
		MyClass022 o4 = (MyClass022) o2;
		
		MyClass022 o5 = (MyClass022) o1; //문법오류는 아님
		//그러나 실행시키면 오류 발생
		*/
		
		//오류없이 안전하게 형변환을 하기 위해서 instanceof메소드 사용
		if(o1 instanceof MyClass021) {
			MyClass021 o3 = (MyClass021) o1;
		}
		
		if(o2 instanceof MyClass022) {
			MyClass022 o4 = (MyClass022) o2;
		}
		
		if(o1 instanceof MyClass022) {
			MyClass022 o5 = (MyClass022) o1;
		} //x
		
		
		System.out.println("실행 흐름 이어감..");
	}
}
