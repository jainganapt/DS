package Trickey;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashCodeCheck {

	private int l;

	public int getL() {
		return l;
	}

	public void setL(int l) {
		this.l = l;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public HashCodeCheck(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	@Override
	public int hashCode() {
		System.out.println("hashcode");
		return l * b;
		/*
		 * final int prime = 31; int result = 1; result = prime * result + b; result =
		 * prime * result + l; return result;
		 */
	}

	/*
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; HashCodeCheck other = (HashCodeCheck) obj; if (b != other.b) return
	 * false; if (l != other.l) return false; return true; }
	 */

	private int b;

	public static void main(String arg[]) {
		Map<HashCodeCheck, Integer> m1 = new HashMap<>();

		HashCodeCheck h1 = new HashCodeCheck(5, 6);
		HashCodeCheck h2 = new HashCodeCheck(10, 2);
		HashCodeCheck h3 = new HashCodeCheck(10, 3);

		m1.put(h1, 1);
		m1.put(h2, 2);
		m1.put(h3, 3);

		h1.setB(6);
		h1.setL(5);

		System.out.println(m1.get(h1));

		System.out.println(m1.get(h3));

		ConcurrentHashMap<String, String> premiumPhone = new ConcurrentHashMap<String, String>();
		premiumPhone.put("Apple", "iPhone");
		premiumPhone.put("HTC", "HTC one");
		premiumPhone.put("Samsung", "S5");

		Iterator iterator = premiumPhone.keySet().iterator();

		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
			premiumPhone.put("Sony", "Xperia Zasadasdsasdas");
		}
		
		//iterator = premiumPhone.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
		}
		
		//above will print nothing as we need to reset the i
		
		iterator = premiumPhone.keySet().iterator();
		while (iterator.hasNext()) {
			System.out.println(premiumPhone.get(iterator.next()));
		}

		//above will print *********Sony************ as well along with 3 values 
	}
}
