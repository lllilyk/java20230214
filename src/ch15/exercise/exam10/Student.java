package ch15.exercise.exam10;

public class Student implements Comparable<Student>{
	public String id;
	public int score;
	
	public Student(String id, int score) {
		this.id = id;
		this.score = score;
	}
	
	@Override
	public int compareTo(Student o) {
		/*if(score<o.score) return -1; //자기자신의 점수와 파라미터로 넘어온 점수 비교
		else if(score == o.score) return 0;
		else return 1;*/
		return this.score - o.score;  
	}
}
