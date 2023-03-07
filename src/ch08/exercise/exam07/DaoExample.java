package ch08.exercise.exam07;

// 클래스, 인터페이스 만들고 싶은 곳에 커서두고
// ctrl + 1

public class DaoExample {
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}
	
	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MysqlDao());
	}
}
