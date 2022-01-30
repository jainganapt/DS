package LeetCode;

public class LinkAddTwoNum {

	public static void main(String arg[]) {
		addnumer(100, 900);

	}

	private static void addnumer(int a, int b) {
		// TODO Auto-generated method stub

		linkNode l1 = null;

		while (a > 0) {

			int num = a % 10;
			a = a / 10;
			l1 = createnewNode(l1, num);

			System.out.println("***" + l1.link);

		}

		printNode(l1);

		linkNode l2 = null;

		while (b > 0) {

			int num = b % 10;
			b = b / 10;
			l2 = createnewNode(l2, num);

		}
		printNode(l2);

		linkNode l3 = addlist(l1, l2);
		
		printNode(l3);
		int val=0;
		int power=0;
		while(l3!=null)
		{
			
			System.out.println("l3.value"+l3.value+" :"+Math.pow(10, power)+":"+power);
			val=val+(int)Math.pow(10, power)*l3.value;
			System.out.println("val"+val);
			power=power+1;
			l3=l3.link;
		}
		
		System.out.println("val=>"+val);
				
		
		

	}

	private static void printNode(linkNode l5) {

		while (l5 != null) {
			System.out.println("->" + l5.value);
			l5 = l5.link;
		}

	}

	private static linkNode addlist(linkNode l1, linkNode l2) {

		linkNode l4 = null;
		int carry = 0;
		while (l1 != null && l2 != null) {
			l4 = createnewNode(l4, (l1.value + l2.value + carry) % 10);
			carry = (l1.value + l2.value + carry) / 10;
			//System.out.println("->" + l1.value + "->" + l2.value + "->" + l4.value);
			l1 = l1.link;
			l2 = l2.link;

		}
		while (l1 != null) {
			carry = (l1.value + carry) / 10;
			l4 = createnewNode(l4, (l1.value + carry) % 10);
			//System.out.println("->" + l1.value + "->" + "->" + l4.value);
			l1 = l1.link;

		}

		while (l2 != null) {
			carry = (l2.value + carry) / 10;
			l4 = createnewNode(l4, (l2.value + carry) % 10);
			//System.out.println("->" + l4.value + "->" + "->" + l2.value);
			l2 = l2.link;

		}

		System.out.println("Carry"+carry);
		
		printNode(l4);
		
		while (carry > 0) {
			l4 = createnewNode(l4, carry);
			//System.out.println("::" + l4.value + "::");
			carry=0;

		}
		//System.out.println("l4"+l4);
		return l4;

	}

	private static linkNode createnewNode(linkNode l, int a) {
		// TODO Auto-generated method stub

		linkNode p = l;
		linkNode dummy = new linkNode(a);
		dummy.link = null;

		if (l != null) {
			//System.out.println("->::" + l.value);
			while (p.link != null) {
				p = p.link;
			}
			p.link = dummy;
			return l;
		}

		return dummy;

	}

}

class linkNode {

	int value;
	linkNode link;

	linkNode(int x) {
		value = x;

	}
}
