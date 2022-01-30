package linkedList;

public class RemovefromSortedList {
	
	public static void main(String arg[])
	{
		
		linkedlist l1 = new linkedlist(1);
		l1.next = new linkedlist(2);
		l1.next.next = new linkedlist(2);
		l1.next.next.next = new linkedlist(3);
		l1.next.next.next.next = new linkedlist(3);
		l1.next.next.next.next.next = new linkedlist(5);
		l1.next.next.next.next.next.next = new linkedlist(6);
		
		
		printlist(removeduplicate(l1));
		
	}
	
	
   private static linkedlist removeduplicate(linkedlist l1) {
		
	   if(l1==null)
		return null;
		
	   linkedlist prev = null;
	   linkedlist curr = l1;
	   
	   while(curr!=null && curr.next!=null)
	   {
		   if(curr.val == curr.next.val)
		   {
			   System.out.println("matched value");
			   prev=curr;
			   curr=curr.next.next;
			   prev.next=curr;
		   }
		   else {
			   
			   System.out.println("not matched value");
			   
			   prev=curr;
			   curr=curr.next;
		   }
	   }
		
	   
	   return l1;
	}


private static void printlist(linkedlist l1) {
		
		while(l1!=null)
		{
			System.out.println("=>"+l1.val);
			l1=l1.next;
		}
	}
	

}
