import java.util.ArrayList;
import java.util.List;

public class Inheritance {
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("Name1");
		names.add("Name2");
		printList(names);
		List<Integer> numbers=new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		printList(numbers);
	}

	/**
	 * In List<Object>, Object is the super class of String and
	 * Integer. In normal Java concepts Object should have taken in
	 * String and Integer but in Generics its not support. As
	 * There is no implications if you are just reading from it.
	 * Problem is with write.
	 * There are 2 ways to solve it
	 * 1. use List --> Non generic type
	 * 2. use List<?> --> Generic Type which can take any type passed to it
	 * 		2 has limitations that you can only read and not write
	 * @param names
	 */
	private static void printList(List<?> names) {
		names.forEach(System.out::println);
		//names.add("Hello");
	}
}
