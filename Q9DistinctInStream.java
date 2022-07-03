package assignment4June30;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q9DistinctInStream {
	public static void main(String[] args) {
		List<Integer> numList = Arrays.asList(1, 6, 1, 15, 4, 11,11, 12,15, 15);
		numList.stream().distinct().forEach(System.out::println);

		List<String> nameList = Arrays.asList("Rahul","Ujjwal","Vishesh","Raj","Prem","Amit","Raj","Prem");
		List<String> distinctNameList = nameList.stream()
				.distinct()
				.collect(Collectors.toList());
		System.out.println(distinctNameList);
	}
}