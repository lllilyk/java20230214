package ch15.lecture.p03set;

import java.util.*;

public class C05Contains2 {
	public static void main(String[] args) {
		
		var character = new HashSet<Slamdunk>();
		
		character.add(new Slamdunk("Taewoong"));
		character.add(new Slamdunk("Soyeon"));
		character.add(new Slamdunk("Baekho"));
		
		character.add(new Slamdunk("Baekho"));
		
		System.out.println(character.size());
		
		System.out.println(character.contains(new Slamdunk("Taewoong")));
		
		character.add(new Slamdunk("Junho"));
		System.out.println(character.size());
		
		System.out.println(character.contains("Junho"));
		System.out.println(character.contains(new Slamdunk("Junho")));
		
		System.out.println(character);
	}
}

class Slamdunk {
	private String member;

	public Slamdunk(String member) {
		this.member = member;
	}

	@Override
	public String toString() {
		return "[member=" + member + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(member);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Slamdunk other = (Slamdunk) obj;
		return Objects.equals(member, other.member);
	}

	public String getMember() {
		return member;
	}

	public void setMember(String member) {
		this.member = member;
	}
}