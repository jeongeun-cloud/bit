package exercise14;

import java.util.OptionalInt;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_6 {

	public static void main(String[] args) {
		String[] strArr = {"aaa", "bb", "c", "dddd"};
		Stream<String> strStream = Stream.of(strArr);
		
		IntStream strInt = strStream.mapToInt(String::length);
		OptionalInt result = strInt.max();
		System.out.println(result.getAsInt());
		
		
		// ´ä
//		strStream.map(String::length).sorted(Comparator.reverseOrder())
//		.limit(1).forEach(System.out::println);
	}
	
}
