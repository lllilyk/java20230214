package ch07.sec03.exam01;

public class Phone {
	//필드 선언
	private String model;
	private String color;
	
	//기본 생성자 선언
	public Phone(String model, String color) {
		System.out.println("Phone() 생성자 실행");
		this.model = model;
		this.color = color;
	}

	//Source > generate getters and setters 
	//필드가 private으로 선언되어있으므로 
	//필드를 읽고 변경하기 위해서는
	//getter와 setter메소드가 필요
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
