package ch15.exercise.exam08;

import java.util.*;

public class Student {
	public int studentNum;
	public String name;
	
	public Student (int studentNum, String name) {
		this.studentNum = studentNum;
		this.name = name;
	}

	//학번이 같으면 동일한 hashCode가 리턴됨
	@Override
	public int hashCode() {
		return studentNum;
	}

	//학번이 같으면 true가 리턴됨
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student target) {
			return (target.studentNum==studentNum);
		} else {
			return false;
		}
	}
}

//studentNum만 체크하고 generate 하면 나처럼 다 쓸 필요 없음