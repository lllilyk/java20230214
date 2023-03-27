package ch18.sec03.exam02;

import java.io.*;
import java.util.*;

public class ReadExamplePractice2 {
	public static void main(String[] args) {
		
		try (var is = new FileInputStream("output/test2.db")){
			byte[] data = new byte[5];
			
			System.out.println(Arrays.toString(data));
			
			Arrays.fill(data, (byte)1);
			System.out.println(Arrays.toString(data));
			
			is.read(data);
			System.out.println(Arrays.toString(data));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
