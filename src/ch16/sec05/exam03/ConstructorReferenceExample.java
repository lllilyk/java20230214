package ch16.sec05.exam03;

public class ConstructorReferenceExample {
	public static void main(String[] args) {
		Person person = new Person();
		
		Member m3 = person.getMember1(s -> new Member(s));
		Member m1 = person.getMember1(Member :: new); //위의 코드와 같음
		System.out.println(m1);
		System.out.println();
		
		Member m4 = person.getMember2((s, t) -> new Member(s, t));
		Member m2 = person.getMember2(Member :: new); //위의 코드와 같음
		System.out.println(m2);
	}
}
