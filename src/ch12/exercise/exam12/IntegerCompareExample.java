package ch12.exercise.exam12;

public class IntegerCompareExample {
	public static void main(String[] args) {
		Integer obj1 = 100;
		Integer obj2 = 100;
		Integer obj3 = 300;
		Integer obj4 = 300;
		
		System.out.println(obj1 == obj2);
		//Integer의 범위값인 
		//-128 ~ 127의 초과값일 경우 
		//값이 같아도 인식을 못하기 때문에 
		//오류 발생
		//참조 타입(값)을 비교할 때는 오류가 발생하지 않도록
		//equals메소드 사용해주기!
		System.out.println(obj3.equals(obj4));
	}
}
