package ch06.lecture.p11capsule;

public class MyClass01 {
	private int age; //같은 클래스 안에서 접근 가능
	
	public void setAge(int age) { //다른 클래스에서도 접근 가능
		if(age < 0) {
			this.age = age; 			
		} else {
			this.age = age;
		}
	}
	
	public void desc() {
		System.out.println("나이는 : " + this.age + "입니다.");
	}
}
