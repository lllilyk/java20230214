package ch06.lecture.p03method;

public class MyClass12 {
	
	int method1() {
		//return
		//1. 메소드 종료, 
		//2. 오른쪽 값을 호출한 곳으로 return(반환)
		//오른쪽 값은 메소드 리턴타입과 일치해야함
		return 3; 
	}
	
	int method2() {
		// 메소드에 리턴타입을 명시하면
		// 해당 타입의 값을 꼭 리턴해야함
		
		if(true) { 
			return 3;
		}
		// else는 생략가능
		return 5; //꼭 리턴할 수 있도록 코드 짜기
		// if 문 이후에 return 값을 주지 않으면 if문의 결과가 false일때 리턴값이 없으므로 오류
		}
	
	// 자동형변환
	int method3() {
		int a = 3;
		
		return a;
	}
	
	/*int method4() {
		long a = 3L;
		
		return a; // int라고 메소드 타입을 명시했으므로 당연히 오류
	}*/
	
	int method5() {
		short a = 6000;
		
		return a; // short는 int로 자동형변환
	}
		
	double method6() {
		double d = 3.14;
		
		return d;
	}
	
	// 메소드 선언할 때의 타입보다 실행문의 타입이 작으면 자동형변환 가능
	double method7() {
		long l = 33;
		
		return l; 
	}
	
	// 리턴이 없으면 void로 리턴타입 명시
	void method8() {
		return; // 만약 쓴다면 메소드 종료 역할로만 사용 가능
 	}
	
	
	
	}
	
