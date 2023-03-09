package ch12.lecture.p04system;

public class C01System {
	public static void main(String[] args) {
		// System
		// currentTimeMillis
		// 현재시간(1970년 1월 1일 0시부터 현재까지의 milli second 경과)
		// currentTimeMillis() 보다 nanoTime()이 더 쓰이는 듯
		
		long current = System.currentTimeMillis();
		System.out.println(current);
		}
	}
	
