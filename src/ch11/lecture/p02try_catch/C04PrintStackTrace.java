package ch11.lecture.p02try_catch;

public class C04PrintStackTrace {
	public static void main(String[] args) {
		//unchecked exception
		
		try {			
			String a = "java";
			System.out.println(a.charAt(4)); //unchecked exception
			
		} catch(StringIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		//forName에 마우스 두고 ctrl + 1 하면 surround try/catch 나오고 누르면 자동으로 생성해줌
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //exception이 발생하든 안하든 오류 표시됨
	}
}
