package String;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListEx {

	public static void main(String arg[]) {
		List<String> l1 = new ArrayList<String>();
		l1.add("1");
		

		ListIterator<String> itrator = l1.listIterator();

		while (itrator.hasNext()) {
			System.out.println(itrator.next());
		}

	}

}
