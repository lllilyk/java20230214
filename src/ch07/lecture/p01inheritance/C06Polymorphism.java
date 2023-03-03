package ch07.lecture.p01inheritance;

public class C06Polymorphism {

	public static void main(String[] args) {
		Sub06 o1 = new Sub06();
		
		Super06 o2 = o1; // = 다음이 주체
		//Sub06은 Super06이라고 할 수 있으니까 가능
		//밝은무늬 재규어는 재규어다o
		
		//위 두줄을 줄인것
		Super06 o3 = new Sub06(); //ok
	
		//반대로는 안됨
		//재규어는 밝은무늬 재규어다x
		Super06 o4 = new Super06();
		//Sub o5 = o4;
		
	}
}
