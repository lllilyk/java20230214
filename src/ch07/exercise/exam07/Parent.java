package ch07.exercise.exam07;

public class Parent {
	public String nation;
	
	public Parent() {
		//String 타입의 매개값을 넣어서 다른 parent생성자 호출
		this("대한민국");
		System.out.println("Parent() call");
	}
	 
	public Parent(String nation) {
		this.nation = nation;
		System.out.println("Parent(String nation) call");
	}
}
