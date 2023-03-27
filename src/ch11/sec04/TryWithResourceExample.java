package ch11.sec04;

public class TryWithResourceExample {
	public static void main(String[] args) {
		
		//AutoCloseable 인터페이스를 구현한 MyResource 리소스를 try-with-resources 블록에서 사용
		//try 블록에서 예외 발생 여부와 상관없이 안전하게 close() 메소드가 실행됨
		
		try (MyResource res = new MyResource("A")) {
			String data = res.read1();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
	
		try (MyResource res = new MyResource("A")) {
			String data = res.read2();
			int value = Integer.parseInt(data);
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
		
		System.out.println();
		
		MyResource res1 = new MyResource("A");
		MyResource res2 = new MyResource("B");

		//복수 개의 리소스를 사용해야 하는 경우, 아래와 같이 try()괄호 안에 세미콜론(;)으로 구분해서 리소스 여는 코드를 작성!
		try(res1; res2){
			String data1 = res1.read1();
			String data2 = res2.read1();
		} catch(Exception e) {
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
}
