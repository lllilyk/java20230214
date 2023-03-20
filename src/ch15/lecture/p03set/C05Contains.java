package ch15.lecture.p03set;

import java.util.*;

public class C05Contains {
	public static void main(String[] args) {
		//Set <String> Book = new HashSet<>();
		var set = new HashSet<Book>();
		set.add(new Book("slamdunk"));
		set.add(new Book("avatar"));
		set.add(new Book("topgun"));

		//재정의 한 후에 추가하면 적용x
		set.add(new Book("slamdunk")); //중복이기때문에
		
		System.out.println(set.size());
		
		//object equals 메소드를 썼는데 재정의한 적이 없으므로 false
		System.out.println(set.contains(new Book("avatar")));
		// false
		
		System.out.println(set);
		
		//재정의 해주면 true가능
		//source > generate hashcode & equals 하고 나면 true
	}
}

class Book {
	private String title;

	public Book(String title) {
		super();
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}

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
		Book other = (Book) obj;
		return Objects.equals(title, other.title);
	}
	
	
}