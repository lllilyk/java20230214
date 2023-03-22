package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExample2 {
	public static void main(String[] args) {
		//읽을 파일 크기 : 3bytes
		try (var is = new FileInputStream("output/test2.db")){
			byte[] data = new byte[5]; //{0, 0, 0, 0, 0}으로 출력// 배열의 초기값이 0이니까
			
			//--------------------------------------------
			Arrays.fill(data, (byte)1); //1로 채우는 코드
			//--------------------------------------------
			
			System.out.println(Arrays.toString(data));
			is.read(data);
			System.out.println(Arrays.toString(data)); //3바이트 짜리 파일이기때문에 3개값은 읽어서 넣었고 나머지는 그냥 초기값이 들어간 것
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
