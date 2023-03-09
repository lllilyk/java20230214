package ch12.lecture.p02wrapper;

public class C04Boxing {
	public static void main(String[] args) {
		int i1 = 30000;
		int i2 = 30000;
		
		System.out.println(i1 == i2);
		
		// 저장되는 방식이 다름 o1,o2는 참조값을 저장하기 때문에
		// 이 방식은 쓰지 말 것
		Integer o1 = i1;
		Integer o2 = i2;
		//o1,o2의 참조값을 비교한 것 
		System.out.println(o1 == o2); //(쓰지 말 것)
		
		
		//필드 비교(참조타입 비교할 때 사용)
		System.out.println(o1.equals(o2));
		
		
	}
}
