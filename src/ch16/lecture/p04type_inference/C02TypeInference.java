package ch16.lecture.p04type_inference;

import java.util.*;

public class C02TypeInference {
	
	//필드 아닌 지역변수에서만 가능
    //var field = 3;
	
	public static void main(String[] args) {
		
		// 지역변수 타입 추론
		//선언과 동시에 초기화할 때만 사용 가능
//		var e;
//		e = 9; //안됨
		
		int a = 3;
		String b = "java";
		
		//var라는 키워드로 변수의 타입을 생략할 수 있음
		var c = 5;
		var d = "hello";

		Box<String> box1 = new Box<String>();
		Box<String> box2 = new Box<>();
		
		//오른쪽 타입에 의해서 앞의 타입이 유추 > 생략
		var box3 = new Box<String>();
		
		var list1 = new ArrayList<List<String>>();
		
		//재할당시 같은 타입만 가능
		var f = 10; //integer
		f = 11; //o
//		f = 3.14; //x double
		
		//var 사용시 읽기 쉬운 코드인지 고민하고 작성하기
		var list2 = new ArrayList<String>();
		
		// 긴 코드..
		
		// item 타입이 String이라는 걸 쉽게 알 수 있음
		for (String item : list2) {
			
		}
		
		//권장하지 않음
		//item의 타입이 뭔지 가까이에 작성되어 있지 않아서 읽기 어려움 28번째 코드까지 올라가야됨
		for (var item : list2) {
			
		}
		
		//var는 키워드가 아님
		int var = 3; //사용 가능 하지만 변수명으로 사용하지 말기
		
	}
}
