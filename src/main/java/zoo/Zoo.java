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
		Cage<Monkey> cage1=new Cage(new Monkey(),new Lion());
		/**
		 * LHS(Generic Type) RHS(Non Generic Type) and
		 * Java Supports backward compatibility
		 */
		Cage<Monkey> cage2= new Cage<Monkey>(new Monkey(),new Lion());
		/**
		 * LHS(Generic Type) RHS(Generic Type) and
		 * Both input Parameter should be of same
		 * Type either Monkey or Lion
		 */
	}
}
