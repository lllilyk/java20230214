package ch11.lecture.p03finally;

public class C02Finally {
	public static void main(String[] args) {
		try {
			boolean a = true;
			
			if(a) {
				return ;
			} else {
				System.out.println("try block.....");
			}
		} catch(NullPointerException e) {
			System.out.println("exception block.....");
		} finally { //try, catch 블럭과 전혀 상관없음. try블럭에서 return 되어도 실행됨
			System.out.println("finally block.....");
		}
		System.out.println("continue"); //try 블럭에서 return 되었기때문에 흐름이 여기까지 넘어오지 않음
	}
}
