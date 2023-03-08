package ch08.lecture.p05cast;

import java.io.*;
import java.lang.constant.*;

public class C04Instanceof {
	public static void main(String[] args) {
		String s1 = "java";
		
		// 자바 api에 string 검색해서 확인해보기!
		System.out.println(s1 instanceof String);//o
		System.out.println(s1 instanceof Object);//o
		System.out.println(s1 instanceof CharSequence);//o
		System.out.println(s1 instanceof Comparable);//o
		System.out.println(s1 instanceof Serializable);//o
		System.out.println(s1 instanceof Constable);//o
		System.out.println(s1 instanceof ConstantDesc);//o
	}
}
