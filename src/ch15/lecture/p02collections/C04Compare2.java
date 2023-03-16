package ch15.lecture.p02collections;

import java.util.*;

public class C04Compare2 {
	public static void main(String[] args) {
		//List<Start> birthDay = new ArrayList<>();
		var birthDay = new ArrayList<Start>();
		birthDay.add(new Start("a", "20000101"));
		birthDay.add(new Start("b", "20010202"));
		birthDay.add(new Start("c", "20020303"));
		
		//나이가 어릴수록 작은 index에 들어가도록 정렬
		Collections.sort(birthDay, (c, t) -> c.getBirth().compareTo(t.getBirth()));
		System.out.println(birthDay);
		
		/*
		//숫자가 클수록 나이가 어리니까 반대로 정렬되도록 하려면?
		Collections.sort(birthDay, (s, y) -> y.getBirth().compareTo(s.getBirth()));
		System.out.println(birthDay);*/
		
		//또는
		Collections.reverse(birthDay);
		System.out.println(birthDay);
	}
}

class Start {
	//필드
	private String name;
	private String birth;
	
	//생성자
	public Start(String name, String birth) {
		this.name = name;
		this.birth = birth;
	}

	//Getter와 Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	//toString 메소드 재정의
	@Override
	public String toString() {
		return "Start [name=" + name + ", birth=" + birth + "]";
	}
	
	
	

	

	
}