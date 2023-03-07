package ch07.sec09;

public class Student extends Person {
	//필드 선언
	public int studentNo;
	
	//생성자 선언
	public Student(String name, int studentNo) {
		// 상위클래스 호출
		// 매개값의 타입과 개수가 일치하는 부모 생성자 호출
		super(name); 
		this.studentNo = studentNo;
	}
	
	//메소드 선언
	public void study() {
		System.out.println("공부를 합니다.");
	}
}
