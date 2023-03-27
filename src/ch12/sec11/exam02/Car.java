package ch12.sec11.exam02;

public class Car {
	//필드
	private String model;
	private String owner;
	
	//생성자
	public Car() {
		
	}
	
	public Car(String model) {
		this.model = model;
	}
	
	//메소드
	public String getModel() {return model;}
	public void SetModel(String model) {this.model = model; }
	public String getOwner() {return owner;}
	public void SetOwner(String owner) {this.owner = owner;}
	}

