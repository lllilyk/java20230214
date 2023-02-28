package ch06.lecture.p03method;

public class C13Return {
	public static void main(String[] args) {
		MyClass13 o1 = new MyClass13();
		o1.method1(); // = 3(리턴한 값)이나 마찬가지

		int var1 = o1.method1(); // 이렇게 변수에 담아서 쓸 수 있음 
		//3은 int니까 변수 타입은 int
	
//		System.out.println(var1); //3
		
		int var2 = o1.method1() * 2;
		
//		System.out.println(var2); //6
		
		//값으로 치환된 상태이므로 파라미터로 그냥 넣을 수도 있음
//		System.out.println(o1.method1()); //3
		
		String var3 = o1.method2();
		System.out.println(var3); //hello

		String var4 = o1.method2() + "java";
		System.out.println(var4); //hellojava
		
		System.out.println(o1.method2()); //hello
	
		//자동형변환
		long var5 = o1.method1(); 
		
	}
}
