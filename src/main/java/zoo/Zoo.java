package zoo;

public class Zoo {
	public static void main(String[] args) {
		Cage<Monkey> cage=new Cage<Monkey>();
		cage.setAnimal1(new Monkey());
		cage.setAnimal2(new Monkey());
		Monkey monkey = cage.getAnimal1();
		/**
		 * If we dont use Generics
		 * Logic in Setting to identify if already
		 * set Animal matches the current set animal
		 */
	}
}
