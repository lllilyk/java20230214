package ch11.lecture.p03finally;

public class C03Finally {
	public static void main(String[] args) {
		try {
			boolean a = true;
			if(a) {
				return ;
			}
			
		} finally { //return 되어도 꼭 실행되는 특징이 있어서 반드시 실행시켜야하는 코드가 있는 경우 catch블록보다 먼저 쓰기도 함
			System.out.println("finally block.....");
		}
	}
}
