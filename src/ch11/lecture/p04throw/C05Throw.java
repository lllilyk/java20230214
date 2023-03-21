package ch11.lecture.p04throw;

public class C05Throw {
	public static void main(String[] args) {
		
	}
	
	
	public static void method3() throws Throwable{ //Throwable이 ClassNotFoundException의 상위타입이니까 가능
		throw new ClassNotFoundException();
	}
	
	
	public static void method2() throws Exception{ //Exception이 ClassNotFoundException의 상위타입이니까 가능
		throw new ClassNotFoundException();
	}
	
	/*
	public static void method1() throws ClassCastException{ //안써도 되지만 씀
		throw new ClassCastException(); 
	}*/
	
	public static void method1() throws RuntimeException{ //RuntimeException이 상위타입이니까 이렇게 써도 됨
		throw new ClassCastException(); 
	}
}
