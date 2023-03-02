package ch06.lecture.p09package;

//static import의 개수가 1개여도 *로 쓰겠다.
//window - preference - import검색 - organize imports - 두번째칸1로 변경
import static ch06.lecture.p09package.package1.MyClass05.*;

//import static ch06.lecture.p09package.package1.MyClass05.method1;
//import static ch06.lecture.p09package.package1.MyClass05.method2;
//import static ch06.lecture.p09package.package1.MyClass05.name;

public class C07StaticImportAll {
	public static void main(String[] args) {
		String n = name;
		method1();
		method2();
	}
}
