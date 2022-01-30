package linkedList;

public class ReverwithGroup {
	
	public static void main(String arg[])
	{
		linkedlist l1 = new linkedlist(1);
		l1.next = new linkedlist(2);
		l1.next.next = new linkedlist(3);
		l1.next.next.next = new linkedlist(4);
		l1.next.next.next.next = new linkedlist(5);
		l1.next.next.next.next.next = new linkedlist(6);
		
		printlist(l1);
		
		System.out.println("");
		printlist(revgroup(l1,3));
		
	}

	private static linkedlist revgroup(linkedlist head, int num) {
		
		int count=0;
		
		linkedlist curr=head;
		linkedlist prev=null;
		linkedlist next=null;
	
		
		 while(curr!=null && num>count)
		 {
			 next =curr.next;
			 curr.next=prev;
			 prev=curr;
			 curr=next;
			 count++; 
		 }
		 
		 if(next!=null)
		 {
			 System.out.println("head"+head.val);
			 head.next= revgroup(next,num);
		 }
		 return prev;
		
	}

	private static void printlist(linkedlist l1) {
		
		while(l1!=null)
		{
			System.out.print("=>"+l1.val);
			l1=l1.next;
		}
	}
}
