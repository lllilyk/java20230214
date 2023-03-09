package ch12.lecture.p02wrapper;

public class C02Wrapper {
	public static void main(String[] args) {
		int i1 = 3;
		
		//현재 버전 (auto boxing)
		//이렇게 쓰면됨
		Integer o1 = i1; //o1은 참조타입 i1은 기본타입 : 저장하는 방법이 다름에도 가능
		
		//예전 버전 
		Integer o2 = new Integer(i1); //(포장,boxing)
		
		Integer o3 = Integer.valueOf(i1); //지금 버전//(포장,boxing)(권장)
		//길어서 현재 버전으로 더 짧게 쓰임
		
		//Integer는 Number, Object에 속함
		Number o4 = i1; //auto boxing, 자동형변환
		Object o5 = i1; //auto boxing, 자동형변환
		
	}
}
