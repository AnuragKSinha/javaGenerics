import java.util.ArrayList;
import java.util.List;

public class GenericsRuntimeCheck {
	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		addToNames(names,"Name1");
		System.out.println(names);
		incorrectAddToNames(names,100);
		System.out.println(names);
		String names2=names.get(1); // Class Cast Exception
		/**
		 * Core Instance doesnot have this property of it being
		 * List<String>.It is just plain old list
		 * Generics is only at Compile time and its only there for
		 * developers
		 */
	}

	private static void incorrectAddToNames(List names, int i) {
		names.add(i);
	}

	private static void addToNames(List<String> names, String name1) {
		names.add("Anurag");
	}
}
