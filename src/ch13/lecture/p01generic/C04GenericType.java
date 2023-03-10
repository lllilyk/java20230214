package ch13.lecture.p01generic;

public class C04GenericType {
	public static void main(String[] args) {
		MyClass04<String, Integer> o1 = new MyClass04<>();
		o1.setTarget("hello");
		o1.setItem(99);
		
		String s1 = o1.getTarget();
		int s2 = o1.getItem();
		
		System.out.println(s1);
		System.out.println(s2);
		
		MyClass04<String, String> o2 = new MyClass04<>();
		MyClass04<Integer, String> o3 = new MyClass04<>();
	}
}

class MyClass04<T, I> { //여러개 사용해도 상관 X
	private T target;
	private I item;
	
	public T getTarget() {
		return target;
	}
	public void setTarget(T target) {
		this.target = target;
	}
	public I getItem() {
		return item;
	}
	public void setItem(I item) {
		this.item = item;
	}
}