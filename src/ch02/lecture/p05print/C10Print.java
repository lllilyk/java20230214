package ch02.lecture.p05print;

public class C10Print {
	public static void main(String[] args) {
		// flag
//		 - : 왼쪽 정렬
		
		System.out.printf("%d%n", 33);
		System.out.printf("%5d%n", 33); //5칸 차지해라
		System.out.printf("%-5d%n", 33); //5칸 차지하는데 왼쪽정렬해라
		
		System.out.printf("%-10s%n", "kim");
		
		
		// 0 : 0으로 채움(수 : int, float 타입과 같이 쓰임)
		System.out.printf("%d%n", 99);
		System.out.printf("%5d%n", 99); //5칸 차지해라
		System.out.printf("%05d%n", 99); //5칸 중에서 99를 제외한 나머지 칸을 0으로 채워라
		
		System.out.printf("%1$05d%n", 99);
		
		System.out.printf("%010f%n", 3.14);
	
		
		// precision : 소수점 이하 자릿수
		
		System.out.printf("%010.3f%n", 3.14);
		
		System.out.printf("%010.3f%n", 3.5555);
	
	
	
	
	
	
	
	
	
	
	}

}
