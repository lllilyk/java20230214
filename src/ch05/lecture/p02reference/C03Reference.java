package ch05.lecture.p02reference;

public class C03Reference {
	public static void main(String[] args) {
		int a = 3; //1번
		
		method1(a);//5번
		System.out.println(a);
		
	}
	
	public static void method1(int b) { //a가 가지고 있는 값이 그대로 b에 복사됨 :3
		System.out.println(b); //2번
		b = 30; //3번
		System.out.println(b);//4번
		
	}
}
