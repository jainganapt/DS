package String;


abstract class Bike {

	abstract void run();

	int a;
	Bike(int q)
	
	{
		System.out.println("asdasdasd");
		q=a;
	}
}

public class bikk extends Bike {

	bikk(int q) {
		super(q);
	}

	public void run() {

	}

	public static void main(String arg[]) {
		
		bikk a  = new bikk(1);
		
		System.out.println("asdasd"+a.a);
		

	}

}
