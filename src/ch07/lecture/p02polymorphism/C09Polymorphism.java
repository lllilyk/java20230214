package ch07.lecture.p02polymorphism;

public class C09Polymorphism {
	public static void main(String[] args) {
		//weapon 클래스 타입의 o1클래스 변수에 gun이라는 새로운 메소드 생성
		Weapon o1 = new Gun(); 
		Weapon o2 = new Bow();
		Weapon o3 = new Sword();
		
		Gun[] o4 = new Gun[3];
		o4[0] = new Gun();
		o4[1] = new Gun();
		o4[2] = new Gun();
		
		//여러개를 생성할 수 있는 weapon클래스 타입의 배열 변수 o5에 weapon배열 메소드를 생성
		Weapon[] o5 = new Weapon[5]; 
		o5[0] = new Weapon();
		o5[1] = new Gun();
		o5[2] = new Bow();
		o5[3] = new Sword();
		
		o5[0].attack();
		o5[1].attack();
		o5[2].attack();
		o5[3].attack();
		
	}
}