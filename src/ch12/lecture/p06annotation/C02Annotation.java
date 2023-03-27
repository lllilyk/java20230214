package ch12.lecture.p06annotation;

import java.lang.annotation.*;

public class C02Annotation {
	public static void main(String[] args) {
		Class c1 = MyClass02.class;
		Annotation[] annotations = c1.getAnnotations();
		System.out.println(annotations.length);
	}
}

@MyAnnotation02
class MyClass02 {
	
}

@Retention(RetentionPolicy.RUNTIME) //: 실행할때까지 유지
//Retention을 명시하지 않으면 class가 default값임
@interface MyAnnotation02 {
	
}
