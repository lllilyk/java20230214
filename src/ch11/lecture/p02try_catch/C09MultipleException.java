package ch11.lecture.p02try_catch;

public class C09MultipleException {
	public static void main(String[] args) {
		try {
			//여러 exception 발생 가능
			
		} catch(ArithmeticException e) {
			e.printStackTrace();
			
			//NumberFormatException이 던져져도 잡을 수 있고 NullPointerException이 던져져도 잡을 수 있는 catch block
		} catch(NumberFormatException | NullPointerException e) {
			e.printStackTrace();
		} 
	}
}
