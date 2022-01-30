package String;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx implements Comparable<TreeSetEx> {

	int id;
	String name;
	int passport;

	TreeSetEx(int a, String n, int p) {
		id = a;
		name = n;
		passport = p;
	}

	@Override
	public int compareTo(TreeSetEx t1) {
		if (passport < t1.passport) {
			return 1;
		} else if (passport > t1.passport) {
			return -1;
		} else {
			return 0;
		}

	}

	@Override
	public String toString() {
		return "TreeSetEx [id=" + id + ", name=" + name + ", passport=" + passport + "]";
	}

	public static void main(String arg[]) {
		
		Set<TreeSetEx> s1 = new TreeSet<TreeSetEx>();
		TreeSetEx t1 = new TreeSetEx(1, "das", 111);
		TreeSetEx t2 = new TreeSetEx(2, "das", 123);
		TreeSetEx t3 = new TreeSetEx(3, "das", 145);

		s1.add(t1);
		s1.add(t2);
		s1.add(t3);

		s1.stream().forEach(a -> System.out.println(a));
		
		for (TreeSetEx a : s1) {
			System.out.println(a);
		}

	}

}
