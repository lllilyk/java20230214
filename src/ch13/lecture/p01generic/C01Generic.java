package ch13.lecture.p01generic;

public class C01Generic {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.setItem("java"); //MyClass01 클래스의 Object 필드값이 "java"로 변경됨

		String s1 = null; //이후에 String 값을 넣을 공간 생성
		Object o2 = o1.getItem(); // o2에 "java"를 넣겠다.  
		
		if (o2 instanceof String) { //o2의 타입이 String 타입인 경우에만 s1에 o2 값을 넣겠다.
			s1 = (String) o2; //s1 = "java"
		}
		
		if(s1 != null) { 
			System.out.println(s1.length()); //s1에 "java"가 들어가 있으므로 결과는 4			
		}
	}
}

class MyClass01 {
	private Object item;

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) { // item 매개값으로 어떤값이든 들어갈 수 있음 object가 root니까
		this.item = item;
	}
}