package exercise14;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercise14_5 {
	
	public static void main(String[] args) {
		String[] strArr = {"aaa", "bb", "c", "dddd"};
		Stream<String> strStream = Stream.of(strArr);
		
		IntStream strInt = strStream.mapToInt(String::length);
		int result = strInt.sum();
		System.out.println("sum=" + result);
		
	}

}
