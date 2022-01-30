package String;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx2 {

	int id;
	String name;
	int passport;

	TreeSetEx2(int a, String n, int p) {
		id = a;
		name = n;
		passport = p;
	}

	/*
	 * @Override public int compare(TreeSetEx2 arg0, TreeSetEx2 arg1) { if
	 * (arg0.passport < arg1.passport) { return 1; } else if (arg0.passport >
	 * arg1.passport) { return -1; } return 0;
	 * 
	 * }
	 */

	@Override
	public String toString() {
		return "TreeSetEx2 [id=" + id + ", name=" + name + ", passport=" + passport + "]";
	}

	public static void main(String arg[]) {

		Set<TreeSetEx2> s1 = new TreeSet<TreeSetEx2>(new EmpComparator());

		TreeSetEx2 t1 = new TreeSetEx2(1, "abc", 111);
		TreeSetEx2 t2 = new TreeSetEx2(2, "acd", 123);
		TreeSetEx2 t3 = new TreeSetEx2(3, "ade", 145);
		TreeSetEx2 t4 = new TreeSetEx2(4, "aef", 146);

		s1.add(t1);
		s1.add(t2);
		s1.add(t3);
		s1.add(t4);

		for (TreeSetEx2 a : s1) {
			System.out.println(a);
		}

	}

}

class EmpComparator implements Comparator<TreeSetEx2> {

	@Override
	public int compare(TreeSetEx2 o1, TreeSetEx2 o2) {
		return o1.id - o2.id;
	}

}
