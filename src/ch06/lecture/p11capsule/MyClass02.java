package ch06.lecture.p11capsule;

public class MyClass02 {
	//외부에서 나이에 접근하지 못하도록 하고 싶으면?
	//필드를 private으로 설정
	private int age;
	
	//메소드를 public으로 설정해서 메소드를 통해 간접적으로 접근할 수 있게
	public int getAge() {
		return this.age;
	}
	
	public void updateAge() {
		this.age++;
	}
}
