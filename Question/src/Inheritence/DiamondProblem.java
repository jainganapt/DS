package Inheritence;

interface A {
	default void hello() {
	}
}

interface B extends A {
	default void hello() {
		System.out.println("1");
	}
}

interface C extends A {
	default void hello() {
		System.out.println("2");
	}
}

interface D extends B, C {
	default void hello() {
	}
}

class E implements B, C {

	@Override
	public void hello() {
		
		B.super.hello();
		C.super.hello();

	}

}

public class DiamondProblem {

	public static void main(String arg[]) {

		E e = new E();
		e.hello();

	}

}
