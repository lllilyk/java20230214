package ch18.lecture.p04writer;

import java.io.*;

public class C01Writer {
	public static void main(String[] args) {
		//Writer : 문자단위 출력 스트림
		//주요 메소드 : write
		
		String fileName = "output/writer1.txt";
		try(Writer wr = new FileWriter(fileName);){
			
			// write
			//작은 따옴표로 표현한 character 1글자가 int타입으로 자동형변환 되니까 문자써도 상관없음
			wr.write('가'); //한글 한 글자는 3byte를 차지 
			wr.write('a');
			wr.write('b'); //영어 한 글자는 1byte로 표현가능
			wr.write(9850); //유니코드 작성 가능
			
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
