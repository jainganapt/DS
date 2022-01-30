package LeetCode;

public class ReverlinkList1 {

	public static void main(String arg[]) {
		
		List2 l1 =  new List2(1);
		l1.next = new List2(2);
		l1.next.next = new List2(3);
		l1.next.next.next = new List2(4);
		l1.next.next.next.next = new List2(5);
		
		printlist(l1);
		
		List2 l2=rev(l1);
		
		System.out.println();

		printlist(l2);
	}
	


	private static List2 rev(List2 head) {
		
		List2 prev=null;
		while(head!=null)
		{
			List2 next = head.next;
			head.next=prev;
			prev=head;
			head=next;
		
		}
		
		
		// TODO Auto-generated method stub
		return prev;
	}



	static void printlist(List2 l1) {
		while (l1!= null) {

			System.out.print("=>"+l1.val);
			l1=l1.next;
		}
	}

}
	class List2 {
		int val;
		List2 next;

		List2(int x) {
			val = x;
		}
	}