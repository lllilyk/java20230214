package ch07.exercise.exam07;

public class Child extends Parent {
	public String name;
	
	public Child() {
		this("홍길동");
		System.out.println("Child() call");
	}
	
	public Child(String name) {
//		super(); 필요한 경우에만 명시적으로 사용
		this.name = name;
		System.out.println("Child(String name) call");
	}
}
 