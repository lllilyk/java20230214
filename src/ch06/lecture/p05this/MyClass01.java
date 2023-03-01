package ch06.lecture.p05this;

public class MyClass01 {

	//this 안써도 되는 경우
	
	//instance field
	String name;
	
	//instance method
	void printName() {
		//this : 참조변수를 대체하는 키워드
		System.out.println(this.name); //this : 아직 만들어지지 않은 객체의 참조값
		System.out.println(this.now());
		//System.out.println(now()); //이렇게 안써도 되고 윗줄처럼 this.를 써도됨
	}
	
	String now() {
		return "세시 십분";
	}
}
