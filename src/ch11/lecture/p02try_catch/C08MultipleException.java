package ch11.lecture.p02try_catch;

public class C08MultipleException {
	public static void main(String[] args) {
		try {
			
			//여러 exception 발생 가능
			//첫번째 catch block 부터 확인하고 해당하면 다음 catch블록들은 무시하고 다음 흐름으로 넘어감
		} /*catch(RuntimeException e) { 
			//11, 13, 15 exception은 runtimeException의 하위타입이니까 쓸모없는 코드가 되어버림
			//아래 catch 블럭의 exception 보다
			//상위 타입의 exception catch블럭을 먼저 작성할 수 없다.
			e.printStackTrace(); } */ 
			
		catch (ArithmeticException e) {
			e.printStackTrace();
		} catch (IndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch (ClassCastException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("continue.....");
	}
}
