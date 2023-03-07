package ch07.lecture.p08Super;

public class C03Super {

}

class Super03 {
	Super03(int i){
		
	}
}

class Sub03 extends Super03{
	Sub03(){
		//자동으로 삽입되는 상위클래스 기본생성자 호출 코드
		//는 동작하지 않음 
		//(왜냐하면 매개값이 있어야하는데 기본 호출코드에는 매개값이 없으니까)
		//super(); //상위 클래스에서 매개값을 넣으라고 설정했으므로 넣어줘야 오류x
		//따라서 명시적 호출해야함
		super(3);
	}
}
