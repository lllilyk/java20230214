package ch15.exercise.exam07;

import java.util.*;

//오류 수정 기능으로 클래스랑 메소드 틀까지는 편하게 생성 가능
public class BoardDao {

	public ArrayList<Board> getBoardList() {
		var list = new ArrayList<Board>();
		
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
		
		return list;
	}

}
