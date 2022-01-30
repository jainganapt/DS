package LeetCode;

public class CyclicLinkList {

	public static void main(String arg[]) {
		
		list1 l = new list1(1);
		l.next = new list1(2);
		l.next.next = new list1(3);
		l.next.next.next = new list1(4);
		l.next.next.next.next = l.next.next;

		// System.out.println();
		//printlist(l);

		System.out.println(iscyllicList(l));

	}

	private static boolean iscyllicList(list1 l) {

		if(l==null)
		return false;
		
		list1 slow=l;
		list1 fast=l.next;
		
		while(fast!=null && fast.next!=null)
		{
			if(slow==fast)
			{
				return true;
			}
			fast=fast.next.next;
			slow=slow.next;
		}
		
		return false;

	}

	private static void printlist(list1 l) {

		while (l != null) {
			System.out.print("=>" + l.val);
			l = l.next;
		}

	}

}

class list1 {
	int val;
	list1 next;

	list1(int x) {
		val = x;
	}
}
