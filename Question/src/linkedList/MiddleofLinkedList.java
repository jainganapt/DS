package linkedList;

public class MiddleofLinkedList {
	
	public static void main(String arg[])
	{
		linkedlist l1 = new linkedlist(1);
		l1.next = new linkedlist(2);
		l1.next.next = new linkedlist(3);
		l1.next.next.next = new linkedlist(4);
		l1.next.next.next.next = new linkedlist(5);
		l1.next.next.next.next.next = new linkedlist(6);
		System.out.println("middle ele"+middleoflist(l1));
		
		printlist(deletemiddleoflist(l1));
		
		//l1.next.next.next.next.next = new linkedlist(6);
		
		//printlist(deletemiddleoflist(l1));
		
		//System.out.println("middle ele"+middleoflist(l1));
		
	}
	
	private static void printlist(linkedlist l1) {
		
		while(l1!=null)
		{
			System.out.println("=>"+l1.val);
			l1=l1.next;
		}
	}

	private static int middleoflist(linkedlist l1) {
		
		 if(l1==null)
			 return -1;
		
		 linkedlist slow =l1;
		 linkedlist fast =l1;
		 
		 while(fast!=null && fast.next!=null)
		 {
			 slow =slow.next;
			 fast =fast.next.next;
		 }
		 
		 
		 return slow.val;
		
	}
	
	private static linkedlist deletemiddleoflist(linkedlist l1) {
		
		 if(l1==null)
			 return null;
		
		 linkedlist slow =l1;
		 linkedlist prev =slow;
		 linkedlist fast =l1;
		 
		 while(fast!=null && fast.next!=null)
		 {
			 prev=slow;
			 slow =slow.next;
			 fast =fast.next.next;
		 }
		 
		 prev.next=slow.next;
		 
		 return l1;
		 
	}
	

}

class linkedlist{
	
	int val;
	linkedlist next;
	
	linkedlist(int x)
	{
		val=x;
	}
}