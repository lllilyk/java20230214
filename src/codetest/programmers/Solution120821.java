package codetest.programmers;

public class Solution120821 {
	
	public int[] solution(int[] num_list) {
        int len = num_list.length;
        
        int[] answer;
        answer = new int[len]; //answer라는 배열변수에 num_list의 길이만큼의 아이템을 넣겠다.
        //아이템 값에 어떤 값이 들어갈지는 아직 모름
        
        for (int i = 0; i < len; i++) {
            answer[len - i - 1] = num_list[i];
        }
        
        return answer;
    }
}