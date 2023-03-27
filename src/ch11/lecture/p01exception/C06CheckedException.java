package ch11.lecture.p01exception;

public class C06CheckedException {
	public static void main(String[] args) throws ClassNotFoundException {
		/*
		//checkedexception은 exception을 다루는 코드가 꼭 필요! - 오류 발생 x
		try {
			Class.forName("java.lang.Object");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}8=*/
		
		//그냥 이렇게 하면 classNotFoundException 발생함
		Class.forName("java.lang.Object");
		
		System.out.println("continue.....");
	}
}
