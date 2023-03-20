package ch17.sec07.exam01;

public class Student implements Comparable<Student> {
	private String name;
	private int score;
	
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {return name;}
	public int getScore() {return score;}

	@Override
	public int compareTo(Student o) {
		return Integer.compare(score, o.score); //자기가 가지고 있는 score와 파라미터로 들어온 score값을 비교
		//return Integer.compare(
	}
}
