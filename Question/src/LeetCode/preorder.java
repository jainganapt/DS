package LeetCode;

public class preorder {

	public static void main(String arg[]) {
		tree t1 = new tree(1);
		t1.left = new tree(2);
		t1.right = new tree(3);
		t1.left.left = new tree(4);
		t1.left.left.left = new tree(5);
		t1.right.left = new tree(6);
		t1.left.left.left.right = new tree(7);

		System.out.println("preeorder");
		preeorder(t1);
		System.out.println("");
		System.out.println("inorder");
		inorder(t1);
		System.out.println("");
		System.out.println("postorder");
		postorder(t1);

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
		 * 
		 * preorder => 1,2,4,5,7,3,6
		 * inorder => 5,7,4,2,1,6,3
		 * postorder =>7,5,4,2,6,3,1
		 */

	}

	private static void preeorder(tree t1) {

		if (t1 == null)
			return;

		System.out.print("->" + t1.val);
		preeorder(t1.left);
		preeorder(t1.right);
	}

	private static void inorder(tree t1) {

		if (t1 == null)
			return;
		inorder(t1.left);
		System.out.print("->" + t1.val);
		inorder(t1.right);
	}

	private static void postorder(tree t1) {

		if (t1 == null)
			return;

		postorder(t1.left);
		postorder(t1.right);
		System.out.print("->" + t1.val);

	}
}

class tree {
	int val;
	tree left;
	tree right;

	tree(int x) {
		val = x;
	}
}
