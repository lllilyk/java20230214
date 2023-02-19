package ch03.sec01;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x= " + x);
		
		System.out.println("------------------");

		y--;
		--y;
		System.out.println("y=" + y);
		
		System.out.println("------------------");
		z = x++;// 이 식에서의 z는 12, 이 식이 끝난 후의 z(x)는 13
		System.out.println("z=" + z);
		System.out.println("x=" + x);
		
		System.out.println("------------------");
		z = ++x + y++;
		System.out.println("z=" + z);
		System.out.println("x=" + x);
	
	
	}
}
