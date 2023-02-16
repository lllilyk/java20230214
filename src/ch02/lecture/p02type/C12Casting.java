package ch02.lecture.p02type;

public class C12Casting {
	public static void main(String[] args) {
		// 정수끼리, 실수끼리
		// 큰타입 > 작은 타입 : 강제형변환(Casting)
		
		int i1; //4bytes
		long l1; //8bytes
		
		l1 = 30;
//		i1 = l1; //오류! 4바이트를 잃어버리게 되니까
		i1 = (int)l1; //강제 형변환
		System.out.println(i1);
		
		l1 = 3000000000L;
		i1 = (int) l1;
		System.out.println(l1);
		System.out.println(i1); //-1294967296 (오류발생)
		
		short s1; //프로그래머 계산기 word로 두고 확인
		byte b1; //프로그래머 계산기 byte로 두고 dec값 확인
		
		s1 = 200;
		b1 = (byte) s1;
		
		System.out.println(s1);
		System.out.println(b1); // 값을 잃어버려서(오류발생)

		
		
		// 실수 > 정수 : 강제형변환(Casting)
		double d2;
		int i2;
		
		d2 =3.14;
		i2 = (int)d2; //강제 형변환
		System.out.println(d2);
		System.out.println(i2); //소수점이하를 버리기 위해서 일부러 종종 쓰는 방법
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
