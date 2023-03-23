package ch18.sec07.exam02;

import java.io.*;

public class ReadLineExample {
	public static void main(String[] args) throws Exception{
		
		String name = "src/ch18/sec07/exam02/ReadLineExample.java";
		
		BufferedReader br = new BufferedReader(new FileReader(name));
		//FileReader에 BufferedReader 보조 스트림 연결
		//문자 입력 스트림 Reader에 BufferedReader를 연결하면 readLine() 메소드를 제공한다는 점이 좋음
		
		int lineNo = 1;
		while(true) {
			String str = br.readLine(); //readLine() 메소드 : 1행의 문자열을 읽음
			if(str == null) break; // 더 이상 읽을 내용이 없으면 while문 종료
			System.out.println(lineNo + "\t" + str); 
			lineNo++;
		}
		
		br.close(); //BufferedReader를 닫으면 연결된 FileReader도 닫힘
	}
}
