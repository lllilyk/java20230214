package ch06.exercise.exam18;

public class ShopService {
	//ShopService singleton = new ShopService(); //필드선언과 동시에 생성자호출
	//다른 클래스에서 호출못하도록 private제한
	//객체는 하나만 만들고 싶으니까 static을 명시하지 않으면 instance 필드가 되므로 
	//static명시
	private static ShopService singleton = new ShopService();
	
	//생성자를 private 제한함으로써 
	//외부에서 new 연산자로 생성자를 호출할 수 없도록
	private ShopService() {
	}
	
	//static (or instance)
	//static을 붙여주지 않으면 instance 메소드로 동작하게 되므로
	public static ShopService getInstance() { 
		return singleton;
	}
}
