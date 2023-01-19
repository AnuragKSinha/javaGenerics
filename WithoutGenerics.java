import java.util.ArrayList;
import java.util.Date;

public class WithoutGenerics {
	public static void main(String[] args) {
		// without generics
		ArrayList names = new ArrayList();
		names.add("Names1");
		names.add("Names2");
		names.add(new Date());
		String firstName=(String)names.get(0);
		String thirdName=(String)names.get(1); // ClassCastException
		/**
		 * Problems without generics
		 * 1. Need to typecast eachtime
		 * 2. We can add some other object than String in names and
		 * 	  there will not be any compilation exception
		 */
	}
}
