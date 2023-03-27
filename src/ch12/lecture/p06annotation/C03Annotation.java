package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C03Annotation {
	
}

@MyAnnotation03
class MyClass03 {
	
	@MyAnnotation03
	String field;

	@MyAnnotation03
	MyClass03(){
	}
	
	@MyAnnotation03
	void method1() {
	}
}

@Target(ElementType.METHOD) //METHOD에만 ANNOTATION을 붙이겠다. 
//다른 곳에 붙인 ANNOTATION은 오류 발생
//명시하지 않으면 다 붙일 수 있음
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation03 {
	
}
