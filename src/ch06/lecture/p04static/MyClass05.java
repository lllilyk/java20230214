package ch06.lecture.p04static;

public class MyClass05 {

	//instance field
	String name;
	
	//static field
	static String model;
	
	//instance method
	void printName() {
		//인스턴스 필드나 인스턴스 메소드에서 static메소드로 접근 가능. 
		//근데 이클립스가 잡아주니까 잘 몰라도 됨
		System.out.println(model); 
		System.out.println(name);
	}
	
	//static method
	static void printModel() {
		System.out.println(model);
		//static member에서 instance member(인스턴스 필드나 인스턴스 메소드)로 접근 가능? 불가
		//System.out.println(name);
	}
}
