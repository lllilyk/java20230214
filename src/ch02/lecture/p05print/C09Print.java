package ch02.lecture.p05print;

public class C09Print {
	public static void main(String[] args) {
		// width 출력할 때 차지할 문자칸 수
		
		System.out.printf("%d%n", 300);
		System.out.printf("%5d%n", 300); //5칸을 띄고 출력하겠다.
		System.out.printf("%8d%n", 300); //6칸을 띄고 출력하겠다.
		
		System.out.printf("%6s%n", "hi");
		System.out.printf("%6s%n", "hello world");
		
		System.out.printf("%7s%n", "slam");
		System.out.printf("%7s%n", "dunk");
		System.out.printf("%7s%n", "slamdunk");
		
		int age = 33;
		String name = "kim";
		
		System.out.printf("나이는 %2$3d이고, 이름은 %1$8s입니다.%n", name, age);
		
		
		
	}

}
