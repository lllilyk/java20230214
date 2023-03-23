package ch18.exercise.exam07;

import java.io.*;

public class exam07 {
	public static void main(String[] args) throws Exception {
		
		//확인문제 7
		//filepath값
		String filePath = "src/ch18/exercise/exam07/exam07.java";
		
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		int rowNumber = 0;
		String rowData;
		while(true) {
			rowData = br.readLine();
			if(rowData == null) break;
//			System.out.println(rowNumber+1 + ": " + rowData);
			System.out.printf("%3s:%s%n", rowNumber, rowData);
			rowNumber++;
		}
		
	}
}
