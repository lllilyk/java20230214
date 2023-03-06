package ch07.lecture.p03cast;

public class C07Instanceof {

	public static void main(String[] args) {
		action(new Animal());
		action(new Horse()); //horse도 animal이니까 ok
		action(new Fish()); //fish도 animal이니까 ok
		
	}
	
	public static void action(Animal a) {//Animal의 파라미터값을 a로 받고
		a.breath();
		
		if (a instanceof Horse) {
			// 말이면 run()
			Horse h = (Horse) a; //말이면 a를 Horse로 강제형변환 해주겠다.
			h.run(); //horse 클래스의 run을 실행하겠다. 
		} else if (a instanceof Fish) { 
			// 물고기면 swim()
			Fish f = (Fish) a;//물고기이면 a를 Fish로 강제형변환 하겠다. 
			f.swim();//Fish 클래스의 swim메소드를 실행하겠다.
		} else {
			System.out.println("말도 아니고 물고기도 아닙니다.");
		}
		
		
	}
}
