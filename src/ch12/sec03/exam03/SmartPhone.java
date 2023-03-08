package ch12.sec03.exam03;

public class SmartPhone {
	private String company;
	private String os;
	
	public SmartPhone(String company, String os) {
		// 필드를 private으로 선언했기 때문에 값을 초기화 하기위해 생성자에서 this.키워드를 이용
		this.company = company; 
		this.os = os;
	}
	
	//객체를 잘 표현해주는 toString 메소드 (보통은 필드값이 궁금할 때 사용함)
	@Override
	public String toString() {
		return company + ", " + os;
	}
}
