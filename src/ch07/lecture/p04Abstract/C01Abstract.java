package ch07.lecture.p04Abstract;

public class C01Abstract {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		//Animal a2 = new Fish();
		//fish 클래스를 abstract 선언해주었기 때문에 new호출 불가
		
		//Animal a3 = new Animal(); //안되게 하고싶으면?
		//Animal 클래스에 abstract클래스라고 명시해주면 됨
		
	}
}
