package ch08.exercise.exam06;

public class Dog implements Soundable{
	@Override
	public String sound() {
		return "멍멍";
	}
}

//SoundableExample 클래스에서 Dog()부분에 
//두고 ctrl+1
//이클립스가 인터페이스 구현해주고
//추상메소드도 만들어줌