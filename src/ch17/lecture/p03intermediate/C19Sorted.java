package ch17.lecture.p03intermediate;

import java.util.*;
import java.util.stream.*;

public class C19Sorted {
	public static void main(String[] args) {
		
		//5,4,3,2,1로 결과가 출력되도록

		IntStream.range(1, 6)
			.boxed()
			.sorted(Comparator.reverseOrder())
			.forEach(System.out::println);
	}
}
