package ch11.lecture.p04throw;

public class C11Throw {
	public static void main(String[] args) {
		try {
			method1();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void method1() throws ClassNotFoundException {
		Class.forName(""); //ctrl + 1 : 2가지 중에 선택하면 ok
	}
}
