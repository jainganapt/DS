package Java8;

import Collection.Employee;

public class CountChar {
	static Employee e = new Employee();

	public void a() {
		e.setName("Shubham");
	}

	public void b(Employee e){
	  e.setName("Karim");

   }

	public static void main(String arg[]) {

		// Character str[] = {'a','b','c','d','e','f'};

		System.out.println(e.getName());

	}

}

