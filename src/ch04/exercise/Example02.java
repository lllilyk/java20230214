//package ch04.exercise;
//
//public class Example02 {
//	String grade = "B";
//	
//	int score1 = 0;
//	
//	String res = switch (grade) {
//					case "A"-> 100;
//					case "B" -> {
//						int result = 100 - 20;
//						yield result;
//					}
//					default -> 60;
//					};
//}
	package ch04.exercise;

	public class Example02 {
		public static void main(String[] args) {
			String grade = "B";

			int score1 = 0;

			switch (grade) {
			case "A":
				score1 = 100;
				break;
			case "B":
				int result = 100 - 20;
				score1 = result;
				break;
			default:
				score1 = 60;
			}
			
			System.out.println(score1);
			
			//switch expression
			int score2 = switch (grade) {
							case "A" -> 100;
							case "B" -> {
								int result = 100 - 20;
								yield result;
							} // 중괄호를 사용하는 경우에는 yield키워드로 값을 지정
							default -> 60;
							};
							
			System.out.println(score2);
		}
	}