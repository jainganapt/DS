package LeetCode;

public class InvertBinaryTree {

	public static void main(String arg[]) {
		tree t1 = new tree(1);
		t1.left = new tree(2);
		t1.right = new tree(3);
		t1.left.left = new tree(4);
		t1.left.left.left = new tree(5);
		t1.right.left = new tree(6);
		t1.left.left.left.right = new tree(7);
		preeorder(t1);
		inverse(t1);
		System.out.println("");
		preeorder(t1);
 
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
	}
private static tree inverse(tree t1) {
	
	if (t1 == null)
		return null;
	
	 tree left=inverse(t1.left);
	 tree right=inverse(t1.right);
	
	 
	 t1.left=right;
	 t1.right=left;
	
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
