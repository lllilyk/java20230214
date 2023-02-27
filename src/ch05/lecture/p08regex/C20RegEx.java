package ch05.lecture.p08regex;

import java.util.Arrays;

public class C20RegEx {
	public static void main(String[] args) {
		String str1 = " al ad al    aldkfj  a    asdflk  asdf   as;df a   ";
		String str2 = str1.replaceAll("\\s+", ""); // + : 공백 여러개 를 빈칸으로 만들겠다. 
		
		System.out.println(str1);
		System.out.println(str2);
				
		String str3 = "alierj   ,    lakjdf,akdfj   ,     aldjkfa";
		String[] str4 = str3.split("\s*,\s*"); //컴마를 기준으로 앞뒤에 공백이 있을 수도 있다. 
		
		System.out.println(Arrays.toString(str4));
				
				
				
				
	}
}
