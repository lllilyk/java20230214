package ch07.lecture.p07sealed;

public class C03Sealed {

}

sealed class Super03 permits Sub031{
	
}

//상속받은 클래스는 non-sealed로 선언가능
//아무 클래스나 상속 가능
non-sealed class Sub031 extends Super03 {}

class Sub0311 extends Sub031{} 