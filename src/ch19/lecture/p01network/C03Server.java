package ch19.lecture.p01network;

import java.io.*;
import java.net.*;


//C03Server 파일을 먼저 실행시키고 상대방 컴퓨터로 C05Client 실행시켜서 서버에게 보낼 데이터 작성하면
//C03Server 파일 실행시킨 쪽이 계속 기다리고 있다가 C05Client의 말을 받아서 출력함

//C03Server 파일 먼저 실행시키고 기다리면 상대방 컴퓨터가 C04Client 실행시키면 
//C04Client의 메시지가 내 C03Server 콘솔에 출력됨
public class C03Server {
	public static void main(String[] args) {
		int port = 50500;
		
		//main 스레드 하나인 싱글스레드이므로 한 번에 한 개의 input만 가능
		System.out.println("연결 기다리는 중...");
		try (
				ServerSocket serverSocket = new ServerSocket(port);
				Socket socket = serverSocket.accept();
				InputStream is = socket.getInputStream();
				BufferedInputStream bis = new BufferedInputStream(is);
				InputStreamReader isr = new InputStreamReader(bis);) {
			
			char[] buf = new char[1024];
			int len = 0;   

			while ((len = isr.read(buf)) != -1) {
				String data = new String(buf, 0, len);
				System.out.print(data);
			}
			System.out.println();

		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("프로그램 종료");
	}
}