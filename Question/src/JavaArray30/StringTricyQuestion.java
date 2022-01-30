package JavaArray30;

public class StringTricyQuestion {

	public void foo(Object o) {
		System.out.println("Object");
	}

	public void foo(String s) {
		System.out.println("String");
	}

	/*
	 * public void foo(Integer s) { System.out.println("String"); }
	 */
	/*
	 * You will get compile time error as The method foo(Object) is ambiguous for
	 * the type Test because both String and Integer class have Object as parent
	 * class and there is no inheritance. So java compiler doesn’t consider any of
	 * them to be more specific, hence the method ambiguous call error.
	 */
	
	public static void main(String[] args) {
		new StringTricyQuestion().foo(null);
	}

}

