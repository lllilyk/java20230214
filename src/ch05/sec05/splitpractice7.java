package ch05.sec05;

public class splitpractice7 {
	public static void main(String[] args) {
		// 두 수를 비교해서 더 큰 수로 교체하는 방식으로 풀기
		
		int[] array = {1, 5, 3, 8, 2};

		int answer = 0;

		for(int i = 0; i < array.length; i++){
		   if(answer < array[i]){
		      answer = array[i];
		   } 
		}

		System.out.println(answer);
		
		/*int i = 0 arr[0]
		0 < 1
		answer = 1
		
		int i = 1 arr[1]
		1 < 5
		answer = 5
		
		int i = 2 arr[2]
		5 < 3 아님
		출력 x
		
		int i = 3 arr[3]
		int i =2 일때 출력 안했으므로 answer는 여전히 5
		5 < 8
		answer = 8
		
		int i =4 arr[4]
		8 < 2 아님
		출력 x
		
		결과적으로 answer = 8*/
				
	
		//int[] array = { -1, -5, -3, -8, -2 };
		
//		int answer = Integer.MIN_VALUE;
		
		
		}
	}



