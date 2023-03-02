package ch06.lecture.p09package;

//import ch06.lecture.p09package.package1.MyClass01;
//import ch06.lecture.p09package.package1.MyClass04;

//패키지 내 모든 클래스(*)
//윗줄보다 더 많이 쓰이므로 기본 설정으로 변경
//window - preference - import검색 - organize imports - 첫번째칸1로 변경
import ch06.lecture.p09package.package1.*;

public class C06ImportALL {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		MyClass04 o2 = new MyClass04();
	}
}
