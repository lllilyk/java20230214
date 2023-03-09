package ch13.lecture.p01generic;

public class C01Generic {
	public static void main(String[] args) {
		MyClass01 o1 = new MyClass01();
		o1.setItem("java");

		String s1 = null;
		Object o2 = o1.getItem(); // object는 string이다(x)

		if (o2 instanceof String) {
			s1 = (String) o2;
		}
		
		if(s1 != null) {
			System.out.println(s1.length());			
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