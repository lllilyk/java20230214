package ch19.lecture.p01network;

import java.io.*;
import java.net.*;

public class C04Client {
	public static void main(String[] args) {
		// ip 주소
		String ip = "172.30.1.77";

		// port 번호
		int port = 50500;

		try (Socket socket = new Socket(ip, port);
				OutputStream os = socket.getOutputStream();
				BufferedOutputStream bos = new BufferedOutputStream(os);
				PrintStream ps = new PrintStream(bos);) {
			
			//내가 이렇게 직접 쓴 코드를 남이 input할 수 있음
			ps.println("Today's menu is kimbab");
			ps.flush();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("클라이언트 종료");
	}
}
