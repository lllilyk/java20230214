package ch06.sec13.exam01.package2; //패키지가 다름

import ch06.sec13.exam01.package1.*;

public class C {
	//필드 선언
	//A a; //default로 접근 제한된 A클래스와 패키지가 다르므로 접근 불가(컴파일 에러)
	B b; //public으로 접근 제한된 B클래스와는 패키지가 달라도 접근 가능
}
