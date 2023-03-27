package ch12.lecture.p06annotation;

public class C08Annotation {
	
}

class MyClass08 {
	@MyAnnotation08 //다 기본 값이 있으니까 attribute 안 써도 됨
	int f1;
	@MyAnnotation08(100)
	int f2;
	@MyAnnotation08(value = 100) //10번째 코드와 같은 코드임
	int f3; 
	@MyAnnotation08(value = 100, name = "lee") //여러개의 attribute를 주고싶은 경우에는 생략 불가
	int f4;
}

@interface MyAnnotation08 {
	int value() default 0;
	String name() default "kim";
	int age() default 0;
}