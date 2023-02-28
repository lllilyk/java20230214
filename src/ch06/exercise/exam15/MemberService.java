package ch06.exercise.exam15;

public class MemberService {
	
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) { //== 말고 equals메소드 쓰기
			return true;
		} 
		return false;
	}
	
	void logout(String id) {
		System.out.println(id + "님이 로그아웃 되었습니다.");
	}
	
}
