package ch12.lecture.p02wrapper;

public class C07UnBoxing {
	public static void main(String[] args) {
		Integer i1 = 30000; //autoboxing
		
		int r1 = i1 + 50000; //unboxing
		
		System.out.println(r1);
		
		Object o1 = 30000; //autoboxing, type conversion
//		int r2 = o1 + 50000; //object는 integer라고 할 수 없으니까 안됨
		
		//강제형변환
		int r3 = ((Integer) o1) + 50000; //하려면 이렇게 할 수는 있는데 위험한 코드
		
		int r4 = ((int) o1) + 50000;
		
		System.out.println(r3);
		System.out.println(r4);
	}
}
