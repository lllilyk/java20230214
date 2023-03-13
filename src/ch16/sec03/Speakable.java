package ch16.sec03;

@FunctionalInterface
public interface Speakable {
	void speak(String content);
	
	//FunctionalInterface의 추상메소드의 파라미터와 꼭 이름이 같을 필요는 없음
	//매개변수 명이 꼭 같을 필요는 없기 때문에 LambdaExample파일에서
	//content가 아닌 word라는 매개변수명 사용
}
