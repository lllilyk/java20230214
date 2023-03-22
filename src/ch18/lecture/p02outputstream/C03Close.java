package ch18.lecture.p02outputstream;

import java.io.*;

public class C03Close {
	public static void main(String[] args) {
		//C02Close 코드처럼 장황하지 않도록 
		//try - with - resources
		
		//상위 타입에 AutoCloseable이 있는 경우에만 가능
		//try의 둥근괄호() 안에 객체를 만든 것 만으로 os.close();를 알아서 실행함
		try (OutputStream os = new FileOutputStream("");){
			os.write(1);
			os.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}