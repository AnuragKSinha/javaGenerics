import java.util.ArrayList;
import java.util.List;

public class UpperBound {
	public static void main(String[] args) {
		List<Integer> integers=new ArrayList<>();
		integers.add(1);
		integers.add(2);
		printNumbers(integers);

		List<Double> doubles=new ArrayList<>();
		doubles.add(2.0);
		doubles.add(1.0);
		printNumbers(doubles);

	}

	private static void printNumbers(List<? extends Number> numbers) {
		numbers.forEach(System.out::println);
		Number number = numbers.get(0);
	}
}
