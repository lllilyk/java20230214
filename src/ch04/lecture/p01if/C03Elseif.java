package ch04.lecture.p01if;

public class C03Elseif {
	public static void main(String[] args) {
		// else if
		// 위 if(else if)의 조건이 false이면 다른 조건 확인
		
		System.out.println("code 1");
		
		if(false) {
			System.out.println("code 2");
		}else if(true) {
			System.out.println("code 3");
		}else if(false) {
			System.out.println("code 4");
		}else if(false)
			System.out.println("code 5"); //else if도 마찬가지로 실행문이 하나이면 {}생략 가능
		else {
			System.out.println("code 6"); //마지막 else는 있어도 없어도 상관없음. 위 코드가 모두 false라면 else코드가 실행됨. 
		}
		System.out.println("실행 이어감...");
		
	}

}
