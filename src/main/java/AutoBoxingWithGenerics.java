import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AutoBoxingWithGenerics {
	public static void main(String[] args) {
		int i = 10;
		Integer x = i; // Autoboxing
		Integer y = new Integer(10);
		int j = y; // unboxing
		List<Integer> list = Arrays.asList(10,20,30);// Autoboxing LHS(Instance of Integer) & RHS (Primitive)
		int first = list.get(0); // unboxing LHS(Primitive) RHS(Instance of Integer)

		// List<Integer> --> Integer is not a value its a Java Type
		//https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

		List<String> list1= new ArrayList<>(); // No need to add type on RHS as it will refer LHS
		list1.add("Hello");
	}
}
