package ch12.lecture.p01object;

public class C06ToString {
	public static void main(String[] args) {
		Object o1 = new MyClass06("son", 77);
		Object o2 = new MyClass06("park", 67);

		System.out.println(o1.toString());
		System.out.println(o2.toString());
	}
}

class MyClass06 {
	private String name;
	private int age;

	MyClass06(String name, int age) {
		this.name = name;
		this.age = age;
	}

	/*@Override
	public String toString() {
		return "나이는 " + age + "살이고 이름은 " + name + "입니다.";
	}*/
	
	@Override
	public String toString() {
		return age + name;
	}
}