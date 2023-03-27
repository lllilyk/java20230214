package ch12.lecture.p06annotation;

public class C07Annotation {
	
}

class MyClass2 {
	@MyAnnotation07(value = "hello")
	String field1;
	
	@MyAnnotation07("greeting") //밑에서 value라는 attribute를 지정해주었으므로 value부분은 생략 가능
	String field2;
	@MyAnnotation07("ohaiyo")
	String field3;
}

@interface MyAnnotation07{
	String value();
}