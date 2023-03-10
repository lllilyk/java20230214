package ch13.sec02.exam03;

public class GenericExample {
	public static void main(String[] args) {
		Box box1 = new Box();
		box1.content = "100";
		
		Box box2 = new Box();
		box2.content = "100";
		
		Box box3 = new Box();
		box3.content = 100;
		
		//Object equals() 메소드는 객체의 번지를 비교
		//compare() 메소드는 객체의 값을 비교
		//boolean result1 = box1.equals(box2);
		boolean result1 = box1.compare(box2);
		System.out.println("result1 : " + result1);
		
		boolean result2 = box1.compare(box3);
		System.out.println("result2 : " + result2);
		
		
	}
}
