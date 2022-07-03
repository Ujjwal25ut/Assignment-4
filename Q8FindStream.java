package assignment4June30;

import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class Q8FindStream {
	public static void FindAnyResult() {
	    Stream<String> list = Arrays.asList("A","B","C","D").stream();

	    Optional<String> result = list.findAny();
	    System.out.println(result);
	}
	public static void FindFirstResult() {

	    Stream<String> list = Arrays.asList("A", "B", "C", "D").stream();

	    Optional<String> result = list.findFirst();
	    System.out.println(result);
	}
	
	public static void main(String[] args) {
		FindAnyResult();
		FindFirstResult();
	}
}
