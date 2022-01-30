package ctor;

class Base {

	void run() {
		System.out.println("Base");
	}
	
	public static void print() {
	
		System.out.println("Print Base");
	}
	

}

public class polymorhism extends Base {

	void run() {
		System.out.println("polymorhism");
	}
	
	public static void print() {
		
		System.out.println("Print polymorhism");
	}

	public static void main(String arg[]) {

		Base b = new Base();
		b.run();
		b.print();

		polymorhism b1 = new polymorhism();
		b1.run();
		b1.print();
		
		Base b2 = new polymorhism();
		b2.run();
		b2.print();
		
		/*
		 * polymorhism b3 = new Base(); b2.run();
		 */
	}
}
