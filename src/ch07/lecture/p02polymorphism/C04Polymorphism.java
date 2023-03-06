package ch07.lecture.p02polymorphism;

import java.util.*;

public class C04Polymorphism {
	public static void main(String[] args) {
		String s1 = "java";
		Scanner sc1 = new Scanner("");
		
		method1(s1);
		method1(sc1); //scanner가 object의 하위이므로 가능(포함되니까)
	}
	
	public static void method1(Object o) { //o에 object에 해당하는 것만 들어온다면 어떤 값이 들어오든 상관 없음
		
	}
	
	
	public static void method2(Object o) {
		//o.charAt(0); //x object에는 charAt이 속해있지 않으니까
		//o.nextLine(0); //x object에는 nextLine이 속해있지 않으니까
		
		String s = o.toString(); //string 안에 toString이 있다는 걸 아니까 어떤 object가 들어오든 상관없음
		System.out.println(s);
	}
	
}
