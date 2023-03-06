package ch07.lecture.p03cast;

public class C01Cast {
	public static void main(String[] args) {
		Animal a1 = new Horse();
		a1.breath();
		//a1.run();
		//animal에 run메소드가 있는게 아니니까 실행불가
		
		//Horse h1 = a1; //animal은 horse다(x) 강제형변환 필요
		
		//강제형변환(type cast)
		Horse h1 = (Horse) a1;
		h1.run(); //강제형변환 하면 가능
		
		
		Animal a2 = new Fish();
		a2.breath();
		//a2.swim(); 
		//animal에 swim메소드가 있는게 아니니까 실행불가
	
		//강제형변환(type casting)
		Fish f1 = (Fish) a2;
		f1.swim();
	}
}

class Fish extends Animal{
	@Override
	public void breath() {
		System.out.println("아가미호흡한다.");
	}
	
	public void swim() {
		System.out.println("헤엄칩니다");
	}
}

class Horse extends Animal{
	@Override
	public void breath() {
		System.out.println("폐호흡한다.");
	}
	
	public void run() {
		System.out.println("달립니다.");
	}
}

class Animal{
	public void breath() {
		System.out.println("호흡한다.");
	}
}
