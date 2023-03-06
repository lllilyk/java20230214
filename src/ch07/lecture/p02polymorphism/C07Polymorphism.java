package ch07.lecture.p02polymorphism;

public class C07Polymorphism {
	public static void main(String[] args) {
		Hero hero = new Hero();
		// ...진행... 무기선택
		Weapon w = getWeapon(3); // 3번 무기 선택
	}

	public static Weapon getWeapon(int choice) {
		switch (choice) {
		case 1 -> {
			return new Gun();
		}
		case 2 -> {
			return new Bow();
		}
		case 3 -> {
			return new Sword();
		}
		}
		return new Weapon();
	}
}