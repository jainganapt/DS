package LeetCode;

public class mergebinarytree {

	public static void main(String arg[]) {
		tree t1 = new tree(1);
		t1.left = new tree(2);
		t1.right = new tree(3);
		t1.left.left = new tree(4);
		t1.left.left.left = new tree(5);
		t1.right.left = new tree(6);
		t1.left.left.left.right = new tree(7);

		System.out.println("mergretree");
		preeorder(t1);
		System.out.println("");
 
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
		 * 
		 *
		 */
		
		tree t2 = new tree(1);
		t2.left = new tree(2);
		t2.right = new tree(3);
		t2.left.right = new tree(5);
		t2.right.left = new tree(6);
		t2.right.left.right = new tree(8);
		preeorder(t2);
		System.out.println("");
		
		//t1-merged tree
		/*
		 * 
		 * 		2 
		 *     /  \ 
		 *    4    6 
		 *   / \   /
		 *   4   5  12
		 *  /       \
		 *  5        8 
             \		 
		 *    7

         */
		System.out.println("");
		preeorder(mergetree(t1,t2));
		System.out.println("");
		
		/*
		 * 
		 * 		 2 
		 *     /  \ 
		 *    4    3 
		 *     \   /
		 *      5  6
		 *         \
		 *          8 
		 
		 */
	}

	private static tree mergetree(tree t1,tree t2) {
	
		if(t2==null)
		return  t1;
		
		if(t1==null)
		return  t2;
		
		t1.val+=t2.val;
		
		t1.left=mergetree(t1.left,t2.left);
		t1.right=mergetree(t1.right,t2.right);
		return t1;
		
	}
	
	private static void preeorder(tree t1) {

		
		if (t1 == null)
			return;

		System.out.print("->" + t1.val);
		preeorder(t1.left);
		preeorder(t1.right);
	}
}
