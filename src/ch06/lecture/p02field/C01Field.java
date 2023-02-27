package ch06.lecture.p02field;

public class C01Field {
	public static void main(String[] args) {
		MyClass01 var1 = new MyClass01(); //변수의 타입이 클래스 이름과 같아야함. //var1 객체는 값 3개를 저장할 수 있음 age, score, name
		
		//var1 은 MyClass01 클래스로부터 생성된 MyClass01클래스의 인스턴스. 
		//var1, var2 이렇게 동일한 클래스로부터 여러 개의 인스턴스를 만들 수 있음. 
		
		// . : 필드 접근 연산자
		var1.age = 99;
		var1.name = "son";
		var1.score = 100;
		
		System.out.println(var1.age); //var1객체의 age값을 보고싶을 때
		System.out.println(var1.name);
		System.out.println(var1.score);
	
		MyClass01 var2 = new MyClass01();
		
		var2.age = 88;
		var2.name = "cha";
		var2.score = 200;
		
		System.out.println(var2.age); //var1객체의 age값을 보고싶을 때
		System.out.println(var2.name);
		System.out.println(var2.score);
	
	
	
	}
}
