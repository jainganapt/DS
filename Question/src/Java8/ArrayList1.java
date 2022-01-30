package Java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList1 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String arg[])

	{
		List<String> a = new ArrayList<String>();
		
		List<Object> var = new ArrayList<Object>();

		a.add("1");
		a.add("2");
		a.add("3");
		a.add("4");
		a.add("3");
		a.add("4");
		a.add("3");
		a.add("4");

		Iterator<String> i1 = a.listIterator();

		while (i1.hasNext()) {

			if (i1.next().equals("3")) {
				i1.remove();
				//a.add("5"); ConcurrentModificationException
			}
			
		}

		i1 = a.listIterator();

		while (i1.hasNext()) {
			System.out.println(i1.next() + ": ");

		}

	}

}
