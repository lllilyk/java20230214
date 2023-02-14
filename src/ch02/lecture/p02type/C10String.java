package ch02.lecture.p02type;

public class C10String {
	public static void main(String[] args) {
		// String (참조타입)
		// 문자열 저장
		
		String s1;
		s1 = "hello world"; // 문자열은 큰따옴표
		
		s1 = "h";
		
		s1 = "";
		
		char c1 = '가'; // 문자는 작은따옴표
		
//		s1 = c1; // x 서로 다른 타입을 옮겨담는 것에 제한이 많음
		
		String s2 = "i am \"ironman\""; // 큰따옴표 안에서 또 큰따옴표 쓸 때는 그 앞에 역슬래시
		System.out.println(s2);
		
		String s3 = "i \\"; //역슬래시를 그냥 쓰고 싶을 때는 두 번 사용
		System.out.println(s3);
		
		String s4 = "i am \n ironman"; //새로운 줄로 표현할 때는 \n
		System.out.println(s4);
		
		String s5 = "<h1>\n\thello \n\t<span>world</span>\n</h1>"; //들여쓰기는 \t
		System.out.println(s5);
		
		// text block
		// 규칙1 : 첫번째 enter무시 ("""뒤의 엔터)
		// 2: 가장 작게 들여쓴 줄이 들여쓰기 기준
		// 3: 안에 큰따옴표나 작은따옴표 상관없이 마음대로
		String s6 = """
				<h1>
					'hello'
					<span>"world"</span>
				</h1>
				"""; //마지막 """을 들여쓰기의 기준으로 삼아서 잘 조절하기
		System.out.println(s6); //s5랑 결과는 똑같지만 알아보기가 훨씬 쉬움
		
		
		
		
		
	}
}
