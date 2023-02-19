package ch02.lecture.p05print;

public class C03Print {
	public static void main(String[] args) {
		// printf(format)
		// 형식에 맞춰서 출력
		
		//System.out.printf("오늘의 점심은"); //어떤 형식인지 입력하지 않았으므로 그냥 출력
		//System.out.printf(" 뭘까요~?"); //print와 똑같이 줄바꿈 없이 출력됨
		
		// %n : 새로운 줄
		System.out.printf("옷소매%n붉은끝동");
		
		// \n : 새로운 줄
		System.out.printf("호밀밭의\n파수꾼");
		
		System.out.println();
		//printf의 형식문자열
//		[]는 생략 가능하다는 의미
		
		// %d : 10진법 정수
		//System.out.printf("format", argument); 형식
		System.out.printf("10진법 정수 %d", 95); //%d 위치에 argument99를 넣어라
		
		System.out.printf("%n또다른 정수 %d", 300);
		
		//System.out.printf("%n또다른 정수 %d", "삼백"); //%d 정수를 출력하겠다고 해놓고 정수가 아니라 string을 넣었기 때문에 오류발생
//		System.out.printf("%n또다른 정수 %d", 3.14); //%d 정수를 출력하겠다고 해놓고 정수가 아니라 double을 넣었기 때문에 오류발생
		
		// %f : 10진법 실수
		System.out.printf("%n10진법 실수 %f", 3.14);
		System.out.printf("%n10진법 실수 %f", 9.999);
//		System.out.printf("%n10진법 실수 %f", 3); //정수 불가
		
		// %s : 문자열
//		System.out.printf("%n문자열 %s"); //argument 없으면 오류발생
		System.out.printf("%n문자열 %s", "lunch");
		System.out.printf("%n문자열 %s", 3); //정수 ok
		System.out.printf("%n문자열 %s", 9.999); //실수 ok
		
		
		System.out.printf("%n%s lunch menu", "Today's"); //%s위치에 hi가 출력
		System.out.printf("%n%dst", 1); //%d위치에 999가 출력
		System.out.printf("%n%f = pi", 3.14); //%f위치에 3.14 출력
		
		
	}
}
