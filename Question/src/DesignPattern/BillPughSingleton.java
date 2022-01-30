package DesignPattern;

public class BillPughSingleton {

	private BillPughSingleton() {
	}

	private static class LazyHolder {
		
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}

	public static BillPughSingleton getInstance() {
		System.out.println("asdasdasasdasd");
		return LazyHolder.INSTANCE;
	}

	public static void main(String arg[]) {

		System.out.println("asdasdas");
	}
}
