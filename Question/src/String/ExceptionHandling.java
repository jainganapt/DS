
package String;

public class ExceptionHandling {
	public static void main(String[] args) throws Exception {
		int x = 5;
		int y = 0;
		float f;
		try {
			f = x / y;
			System.out.println("1");
		} catch (ArithmeticException ae) {
			System.out.println("2");
			throw new Exception();
		} catch (Throwable e) {
			System.out.println("3");
		} finally {
			System.out.println("4");
		}
		System.out.println("5");
	}
}

