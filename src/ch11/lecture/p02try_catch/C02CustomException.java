package ch11.lecture.p02try_catch;

public class C02CustomException {
	public static void main(String[] args) throws Exception {
		Exception e = new Exception(); 
		//파라미터가 없는 exception 생성 
		//exception이 출력되는 곳에 아무것도 출력되지 않음
		
		Exception e2 = new Exception("some message"); 
		//파라미터로 스트링을 하나 받는 exception 생성 : exception 출력되는 곳에 "some message"가 같이 출력됨
		
		System.out.println(e.getMessage());
		System.out.println(e2.getMessage());
		
		throw e;
		
	}
}
