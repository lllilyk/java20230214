package ch07.exercise.exam06;

public class Parent {
	public String name;
	
	public Parent(String name) {
		this.name = name;
	}
}

// 정답)
// 1.부모 클래스에 파라미터 없는 생성자 만들기
// 또는 2. 자식 클래스 생성자에서 부모 클래스에 존재하는 
//         생성자호출코드 작성