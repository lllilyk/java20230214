package ch04.sec04;

public class Forpractice5 {
	public static void main(String[] args) {
//		for(int x = 1; x <=10; x*=4) {
//			for(int y = 1; y <= 10; y*=5) {
//				
//				System.out.println("(" + x + "," + y + ")");
//			}
//		}

		for(int x = 1; x <=10; x++) {
			for(int y = 1; y <= 10; y++) {
				int result = (4 * x) + (5 * y);
				if( result == 60) {
					System.out.printf("(%d, %d)%n", x, y);					
				}
			}
		}
	
	
	
	
	
	
	}
}
