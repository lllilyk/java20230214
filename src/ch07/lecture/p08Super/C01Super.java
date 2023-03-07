package ch07.lecture.p08Super;

public class C01Super {
	public static void main(String[] args) {
		Sub01 o1 = new Sub01();
	}
}

//결론적으로
//하위클래스에서는 반드시 상위클래스를 호출해야한다. 

class Super01 {
	// 1) 이 클래스로 인스턴스 만들 때 해야하는 일
	Super01(){
		System.out.println("상위 클래스 초기화 코드");
	}
}

class Sub01 extends Super01 {
	Sub01(){
		// 2)그 전에 상위클래스의 초기화 작업해야함
		// 3)상위 클래스 생성자 호출 코드 super
		super(); //꼭 해야하고,
		//생성자 안에 있는 다른 코드보다 반드시 선행되어야 함
		//(작성하지 않으면 자동으로 삽입됨)
		
		// 이 클래스로 인스턴스 만들 때 해야하는 일
		System.out.println("하위 클래스 초기화 코드");
	}
}

