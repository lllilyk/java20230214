package ch07.lecture.p01inheritance;

public class C07Polymorphism {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		Animal a2 = new Fish();
		
		a1.breathe(); //실제 인스턴스의 메소드가 실행됨 
		//horse는 animal에 속하고 horse는 animal이라고 할 수 있지만 실제 실행되는 것은 주체!
	}
}

class Animal{
	public void breathe() {
		System.out.println("호흡한다.");
	}
}

class Horse extends Animal{
	@Override
	public void breathe() {
		System.out.println("폐로 호흡한다.");
	}
}

class Fish extends Animal{
	@Override
	public void breathe() {
		System.out.println("아가미로 호흡한다.");
	}
}