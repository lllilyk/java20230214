package ch11.lecture.p01exception;

import java.sql.*;

import javax.sql.*;

public class C08CheckedException {
	public static void main(String[] args) throws SQLException {
		
		DataSource ds = null;
		
		//SQL exception 오류 발생 - main 메소드의 메소드 부분에 throws SQLException 작성하면 오류x 
		Connection con = ds.getConnection();
		
		System.out.println("continue....."); 
	}
}
