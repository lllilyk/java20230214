package ch11.lecture.p05custom;

public class C01CustomException {
	public static void main(String[] args) {
		String menu = null;
		try {
			menu = getMenu(3);
		} catch (Exception e) {
			System.out.println("알 수 없는 메뉴를 선택했습니다.");
			e.printStackTrace();
		}
		System.out.println("선택된 메뉴: " + menu);
	}
	
	public static String getMenu(int num) throws Exception {
		if(num == 1) {
			return "선택";
		} else if(num == 2) {
			return "종료";
		} else {
			throw new NonExistsMenuException(); //클래스 생성하면 흐름이 끝까지 이어짐// 이렇게 직접 예외 생성 가능
		}
	}
}
