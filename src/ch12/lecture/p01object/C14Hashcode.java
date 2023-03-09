package ch12.lecture.p01object;

public class C14Hashcode {
	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		
		int h1 = o1.hashCode();
		int h2 = o2.hashCode();
		
		//객체가 다르면 서로 다른 해시코드를 리턴함
		System.out.println(h1);
		System.out.println(h2);
	}
}
