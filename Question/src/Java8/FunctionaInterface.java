package Java8;

@FunctionalInterface
interface fun {

	int mul(int a, int b);

	@Override
	public String toString();

	@Override
	public boolean equals(Object obj);

	default void hello() {
		System.out.println("sdsasdas");
	}

	static void hello2() {
		System.out.println("sdsasdas121212");
	}
}

public class FunctionaInterface {

	public static void main(String arg[]) {
		fun a1 = (a, b) -> a * b;
		a1.hello();
		fun.hello2();
		fun.hello2();

		System.out.println(a1.mul(1, 5));
	}

}
