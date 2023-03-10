package ch13.lecture.p01generic;

public class C09Inherit {

}

class Super09<T>{}
class Sub09<T> extends Super09<T>{} //상속해준 클래스에 타입 파라미터가 있으면 상속받은 클래스에도 타입 파라미터 필요

class Super10<T, U>{}
class Sub10<T, U> extends Super10<T, U>{} //파라미터 개수도 맞춰줘야함 

class Super11<T>{}
class Sub11 extends Super11<String>{} //상속해준 클래스의 타입 파라미터를 명시하면 상속받는 클래스에는 명시할 필요x

class Super12<T, U>{}
class Sub12<T> extends Super12<T, String>{} //타입 파라미터가 상속해준 클래스에만 있으면 상속받는 클래스에서는 생략가능

class Super13<T>{}
class Sub13<T, U> extends Super13<T>{} //상속받는 클래스에서 타입 파라미터 개수를 더 늘릴 수도 있음

class Super14<T extends Number>{}
class Sub14<T extends Integer> extends Super14<T>{} //상속받는 클래스의 타입 파라미터 제한을 상속하는 클래스보다 상위타입으로 제한 할수 없음
// 같은 타입이나 하위타입으로만 제한 가능


