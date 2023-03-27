package ch15.sec02.exam01;

import java.util.*;

public class ArrayListExample {
	public static void main(String[] args) {
		//ArrayList 컬렉션 생성
		List<Board> list = new ArrayList<>();
		
		//객체 추가 //Board클래스의 Board생성자에 파라미터 대입
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		
		//저장된 총 객체 수 얻기
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		//특정 인덱스의 객체 가져오기
		Board board = list.get(2);
		//System.out.println(board); //List 컬렉션은 값을 저장하는것이 아니라 번지를 저장하기 때문에 x
		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
		System.out.println();
		
		//모든 객체를 하나씩 가져오기
		for(int i = 0; i < list.size(); i++) {
			Board b = list.get(i); // list.get(i) 값에 어떤 값이 들어오든 가능하도록 하려면 Board클래스 타입이 와야함
			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
		}
		System.out.println();
		
		//객체 삭제
		list.remove(2);
		list.remove(2); //2번 인덱스를 삭제하면 3번 인덱스가 2번 인덱스로 변경되므로 다시 2번 인덱스를 제거할 수 있음
		
		//향상된 for문으로 모든 객체를 하나씩 가져오기
		for(Board bb : list) {
			System.out.println(bb.getSubject() + "\t" + bb.getContent() + "\t" + bb.getWriter());
		}
	}
}