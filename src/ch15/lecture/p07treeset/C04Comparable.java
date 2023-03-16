package ch15.lecture.p07treeset;

import java.util.*;

public class C04Comparable {
	public static void main(String[] args) {
		TreeSet<Movie> set = new TreeSet<>();
		set.add(new Movie("topgun"));
		set.add(new Movie("avengers"));
		set.add(new Movie("slamdunk"));
		set.add(new Movie("avatar"));
		
		System.out.println(set);
	}
}

class Movie implements Comparable<Movie> {
	//필드
	private String title;
	
	//생성자
	public Movie(String title) {
		super();
		this.title = title;
	}

	//compareTo 메소드 재정의
	@Override
	public int compareTo(Movie o) {
		//이 객체가 파라미터보다 작으면 음수
		//같으면 0
		//이 객체가 파라미터보다 크면 양수
		return this.title.compareTo(o.title);
	}
	
	//getter & setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toString() {
		return "Movie [title=" + title + "]";
	}

	//hashCode & equals 재정의
	@Override
	public int hashCode() {
		return Objects.hash(title);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(title, other.title);
	}
	
}