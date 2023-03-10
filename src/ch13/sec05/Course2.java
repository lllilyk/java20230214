package ch13.sec05;

public class Course2 {
	public static void registerCourse1(Applicant<?> applicant) {
		Object o = applicant.kind;
	}

	public static void registerCourse2(Applicant<? extends Student> applicant) {
		// in
		Student a = applicant.kind; // 안전하게 사용 가능
		Person p = applicant.kind; // 안전하게 사용 가능
		Object o = applicant.kind; // 안전
		
//		MiddleStudent m = applicant.kind; // 안전하지 않음
	}

	public static void registerCourse3(Applicant<? super Worker> applicant) {

		// out
		applicant.kind = new Worker(); // 안전
		applicant.kind = new SubWorker(); // 안전
		applicant.kind = new SubWorker2(); // 안전
	
//		applicant.kind = new Person(); // 불안전
	}
}

class SubWorker extends Worker {}
class SubWorker2 extends Worker {}