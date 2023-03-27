package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExamplePractice1 {
	public static void main(String[] args) {
		try (var is = new FileInputStream("output/test2.db")){
			byte[] data = new byte[5];
			
			int num = is.read(data);
			int i = 0;
			for(i = 0 ; i < num; i ++) {
				System.out.println(data[i]);
			}
			
			System.out.println(Arrays.toString(data));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
