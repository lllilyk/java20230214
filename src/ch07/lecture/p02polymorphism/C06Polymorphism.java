package ch07.lecture.p02polymorphism;

public class C06Polymorphism {
	public static void main(String[] args) {
		
	}
	
	public static Gun getGun() {
		//...
		
		return new Gun(); 
	}
	
	public static Bow getBow() {
		//...
		Bow b = new Bow();
		return b; //return 오른쪽 값의 타입이 bow타입이어야함
	}
	
	public static Weapon getWeapon() {
		//...
		/*
		Weapon w1 = new Weapon();
		return w1;
		*/
		/*
		Gun gun = new Gun();
		return gun; //gun은 weapon이니까 됨
		*/
		
		Bow bow = new Bow();
		return bow; //gun도 weapon이고 bow도 weapon이니까 위에 gun 이랑 같이는 쓸수 없음
	}
}
