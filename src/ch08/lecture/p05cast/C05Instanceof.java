package ch08.lecture.p05cast;

import java.io.*;
import java.lang.constant.*;

public class C05Instanceof {
	public static void main(String[] args) {
		//method("java");
		//method(new StringBuilder("java"));
		method(new StringBuffer("")); 
		//CharSequence보다 실제로 실행되는 메소드인 StringBuffer가 더 중요함
	}
	
	public static void method(CharSequence c) {
		System.out.println(c instanceof String);
		System.out.println(c instanceof Object); //o
		System.out.println(c instanceof CharSequence);//o
		System.out.println(c instanceof Comparable);//o
		System.out.println(c instanceof Serializable);//o
		System.out.println(c instanceof Constable);
		System.out.println(c instanceof ConstantDesc);
	}
}
