
package Inheritence;

import java.util.Arrays;
import java.util.stream.Collectors;

interface A1 {

	default void draw() {

	}

	static void draw1() {

	}
}

interface B1 {
	default void draw() {
	}

	static void draw1() {

	}

}

class C1 implements A1, B1 {

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		A1.super.draw();
	}
	

}

public class Inheri {

	public static void main(String arg[]) {

		C1 c1 = new C1();
		c1.draw();
		
		A1.draw1();
		B1.draw1();

		//c1.String noDuplicates = Arrays.asList("abcaabc".split("")).stream().distinct().collect(Collectors.joining());
		//System.out.println("noDuplicates:" + noDuplicates);
	}

	
}
