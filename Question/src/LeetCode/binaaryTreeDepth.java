package LeetCode;

public class binaaryTreeDepth {
	
	public static void main(String arg[]) {
		tree t1 = new tree(1);
		t1.left = new tree(2);
		t1.right = new tree(3);
		t1.left.left = new tree(4);
		t1.left.left.left = new tree(5);
		t1.right.left = new tree(6);
		t1.left.left.left.right = new tree(7);
		t1.left.left.left.right.left = new tree(8);
		
		System.out.println("");
		System.out.println(maxDepth(t1));
 
		//t1
		/*
		 * 
		 * 		1 
		 *     / \ 
		 *    2   3 
		 *   /   /
		 *  4    6
		  /
		 5  
	 	 \
	 	  7
	 	  \
	 	   8
		 * 
		 *
		 */
	}

	private static int maxDepth(tree t1) {
		
		if(t1==null)
		return 0;
		
		 int lDepth = maxDepth(t1.left); 
         int rDepth = maxDepth(t1.right); 

         /* use the larger one */
         
         return Math.max(lDepth, rDepth)+1;
		
	}

}
