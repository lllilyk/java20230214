package ch07.lecture.p02polymorphism;

import java.util.*;

public class C03Polymorphism {
	public static void main(String[] args) {
		String s1 = "Hello";
		Object o1 = s1;
		
		Object o2 = "java";
		char c1 = s1.charAt(0);
		System.out.println(c1);
		
		//char c2 = o1.charAt(0);
		
		//String 안에는 charAt이 있지만
		//object 안에는 charAt 메소드 없어서 불가
		
		Scanner sc1 = new Scanner("");
		Object o3 = sc1;
		
		Object o4 = new Scanner("");
		//sc1.nextLine();
		
//		o3.nextLine(); // x
		
		//scanner안에는 nextline이 있지만
		//object 안에는 nextline이라는 메소드가 없으므로 불가
		//실행되는 인스턴스 주체가 누구인지 정확히 알고 호출하기
	}
}
