package ch04.sec08;

public class ContinueExample {
	public static void main(String[] args) {
		for(int i =1; i<=10; i++) {
			if(i%2 != 0) {
				continue; //2의 배수가 아니면 반복문을 계속 반복
			} 
			System.out.println(i + " "); //2의 배수인 경우 if값이 false이므로 continue를 만나지 않아서 출력됨
		}
	}
}
