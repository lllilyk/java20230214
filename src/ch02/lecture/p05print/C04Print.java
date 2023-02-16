package ch02.lecture.p05print;

public class C04Print {
	public static void main(String[] args) {
		//printf는 argument를 0개 이상 넣을 수 있음
		// argument는 순서대로 적용됨
//		System.out.printf("%d, %d%n", 3); //%d를 두번 썼는데 argument가 1개라서 오류발생
//		System.out.printf("%d, %d%n", 3, 5);
		
		System.out.printf("%d, %n%f", 100, 99.99); //두번쨰는 %f로 썼으니까 꼭 실수가 들어가야함
		
		System.out.printf("%n%s, %d, %n%f", "number", 1, 0.1); //format과 argument의 형식이 일치하도록!
		
		
		
	}

}
