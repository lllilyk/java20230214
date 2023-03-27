package ch12.lecture.p06annotation;

public class C06Annotation {

}

class MyClass06 {
	@MyAnnotation06 //default 값을 주었기 때문에 값을 안줘도 오류 발생하지 않음
	String field1;
	@MyAnnotation06(myAttr=10)
	int field2;
	@MyAnnotation06(myAttr=20) 
	boolean field3;
}

@interface MyAnnotation06{
	int myAttr() default 0;
}