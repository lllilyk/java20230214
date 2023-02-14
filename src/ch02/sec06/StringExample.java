package ch02.sec06;

public class StringExample {
	public static void main(String[] args) {
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다.";
		System.out.println(str);
		
		str = "번호\t이름\t직업";
		System.out.println(str);
		
		System.out.print("나는\n");
		System.out.print("자바를\n");
		
		//println은 안에있는 parameter를 출력하고 새로운 줄을 표시o
		//print는 parameter를 출력하고 새로운 줄 출력x 직접 출력해야함
		
	}
	
	

}
