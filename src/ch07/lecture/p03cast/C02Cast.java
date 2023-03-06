package ch07.lecture.p03cast;

public class C02Cast {
	public static void main(String[] args) {
		Super02 o1 = new Sub02(); // Sub02는 Super02다. (o)

		Sub02 o2 = (Sub02)o1; //강제형변환 시키면 Super02도 Sub02가 될 수 있음. 
		
		Super02 o3 = new Super02();
		//exception발생
		Sub02 o4 = (Sub02) o3; //super는 sub다(x)
		
		
		System.out.println("실행코드 이어짐..");
	}
}

class Super02 {
	
}

class Sub02 extends Super02{
	
}
