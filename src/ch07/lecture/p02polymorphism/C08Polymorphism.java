package ch07.lecture.p02polymorphism;

public class C08Polymorphism {
	public static void main(String[] args) {
		Gun o1 = getGun();
		Weapon o2 = getGun();
		
		Weapon o3 = getBow();
		Weapon o4 = getSword();
		
		o2.attack(); //Gun 클래스의 attack 메소드 호출
		o3.attack(); //Bow 클래스의 attack 메소드 호출
		o4.attack(); //Sword 클래스의 attack 메소드 호출
	}
	
	//새로 클래스를 만들어 준 것 뿐!
	public static Gun getGun() {
		return new Gun();
	}
	public static Bow getBow() {
		return new Bow();
	}
	public static Sword getSword() {
		return new Sword();
	}
}
