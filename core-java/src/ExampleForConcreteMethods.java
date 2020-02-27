
public interface ExampleForConcreteMethods {
	public void print1();

	public void print2();

	static void message1() {
		System.out.println("message1() method ");
	}

	default void message2() {
		System.out.println("message2() method ");
	}

	static void message3() {
		System.out.println("message3() method ");
	}
}
