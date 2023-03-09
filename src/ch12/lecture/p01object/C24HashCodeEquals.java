package ch12.lecture.p01object;

import java.util.*;

public class C24HashCodeEquals {
	public static void main(String[] args) {
		Set set = new HashSet();
		
		set.add(new MyClass24(1, "kim"));
		set.add(new MyClass24(2, "edman"));
		set.add(new MyClass24(1, "kim")); 
		//해시코드와 이퀄스 메소드를 재정의하지 않았기 때문에 중복이 아니라고 판단해서 
		//HashSet 사이즈 증가
		
		//source > generate hashcode and equals 
		//생성하고 나면 재정의 되었으므로 HashSet이 11번째 코드를 중복으로 읽어서
		//size가 증가하지 않음 
		
		System.out.println(set.size());
	}
}

class MyClass24{
	private int id;
	private String name;
	
	public MyClass24(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass24 other = (MyClass24) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
}
