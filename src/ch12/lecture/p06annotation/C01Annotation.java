package ch12.lecture.p06annotation;

public class C01Annotation {
	//어디든 붙일 수 있음
}

@MyAnnotation01
class MyClass {
	@MyAnnotation01
	String field;
	
	@MyAnnotation01
	MyClass(){
		
	}
	
	@MyAnnotation01
	void method1() {
		
		@MyAnnotation01
		int var;
	}
	
	void method2(@MyAnnotation01 int param) {
		
	}
}

@interface MyAnnotation01 {
	
}