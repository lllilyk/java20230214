package ch12.sec03.exam02;

public class Student {
	private int no;
	private String name;
	
	public Student(int no, String name) {
		this.no = no;
		this.name = name;
	}
	
	public int getNo() {return no;}
	public String getName() {return name;}
	
	
	//equals에서 no, name을 가지고 동등비교했으니까 
	//hashCode에서도 동일하게 no, name으로 선 비교
	public int hashCode() {
		int hashCode = no + name.hashCode();
		return hashCode;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student target) {
			if(no == target.getNo() && name.equals(target.getName())) {
				return true;
			}
		}
		return false;
	}
}
