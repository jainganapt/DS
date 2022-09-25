package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

class tree {

	int data;
	tree left, right;

	tree() {
		left = null;
		right = null;
	}

	tree(int val) {
		this.data = val;
		left = null;
		right = null;
	}

}

class Nodetree {

	tree root;
	int data;

	Nodetree() {
		root = null;
		data = 0;
	}

	Nodetree(tree root, int val) {
		this.root = root;
		this.data = val;
	}

}

public class TreeCreation {

	static java.util.Scanner sc = new java.util.Scanner(System.in);

	public static void main(String arg[]) {
		// tree root = createTree();

		tree root = new tree(1);
		root.left = new tree(2);
		root.left.left = new tree(4);
		root.left.right = new tree(5);

		root.right = new tree(3);
		root.right.left = new tree(6);
		root.right.right = new tree(7);

		/*
		 * levelOrderprint(root); System.out.println();
		 * System.out.println("via Queue O(n)"); LevelprintTravese(root);
		 * System.out.println(); System.out.println("left view");
		 * System.out.println(leftViewofTheTree(root)); System.out.println();
		 * System.out.println("right view");
		 * System.out.println(rightViewofTheTree(root)); System.out.println();
		 * System.out.println("top view"); System.out.println(topViewofTheTree(root));
		 * System.out.println("bootom view");
		 * System.out.println(bootomViewofTheTree(root));
		 * System.out.println("zigzag view");
		 * System.out.println(ZigzagViewofTheTree(root));
		 * 
		 * System.out.println("level order");
		 * System.out.println(LevelprintTraveselist(root));
		 * 
		 * System.out.println("Diagonal order");
		 * System.out.println(Diagonal_Traversal(root));
		 * System.out.println("boundary traversal");
		 * System.out.println(boundary_Traversal(root));
		 */
		System.out.println("tree to doubly linked list");
		print_list(tree_todoublylist(root));

		
		/*
		 * preorder(root); System.out.println(); inorder(root); System.out.println();
		 * postorder(root);
		 * 
		 * System.out.println("binary tree creation");
		 * 
		 * tree btree = createbinaryTree(); preorder(btree);
		 * System.out.println(heightTree(btree));
		 */
	}



	private static void print_list(tree tree_todoublylist) {
		if(tree_todoublylist==null) System.out.println("dadaf");;
		while(tree_todoublylist.right!=null)
		{
			System.out.println(tree_todoublylist.data+"->-<");
			tree_todoublylist=tree_todoublylist.right;
		}
	}



	private static tree createbinaryTree() {

		tree root = null;
		int val = sc.nextInt();
		if (val == -1)
			return null;
		root = new tree(val);
		System.out.println("Enter leaf node data for " + root.data);
		if (root.data > val) {
			root.left = createbinaryTree();
		} else {
			root.right = createbinaryTree();
		}
		return root;
	}

	private static tree createTree() {

		tree root = null;
		System.out.println("Enter root data");
		int val = sc.nextInt();

		if (val == -1)
			return null;
		root = new tree(val);
		System.out.println("Enter left data for " + root.data);

		root.left = createTree();
		System.out.println("Enter right data" + root.data);
		root.right = createTree();

		return root;
	}

	private static void preorder(tree root) {

		if (root == null)
			return;

		System.out.print(" " + root.data);
		preorder(root.left);
		preorder(root.right);

	}

	private static void inorder(tree root) {

		if (root == null)
			return;
		inorder(root.left);
		System.out.print(" " + root.data);
		inorder(root.right);

	}

	private static void postorder(tree root) {

		if (root == null)
			return;

		postorder(root.left);
		postorder(root.right);
		System.out.print(" " + root.data);

	}

	private static int heightTree(tree root) {

		if (root == null)
			return 0;

		return Math.max(heightTree(root.left), heightTree(root.right)) + 1;

	}

	private static int sizeTree(tree root) {

		if (root == null)
			return 0;

		return sizeTree(root.left) + sizeTree(root.right) + 1;

	}

	private static int maxValueTree(tree root) {

		if (root == null)
			return 0;

		return Math.max(root.data, Math.max(maxValueTree(root.left), maxValueTree(root.left)));

	}

	private static void levelOrderprint(tree root) {

		int h = heightTree(root);

		for (int i = 0; i <= h; i++) {
			printcurrentlevel(root, i);
		}

	}

	private static void printcurrentlevel(tree root, int level) {

		if (root == null)
			return;

		else if (level == 1) {
			System.out.print(" " + root.data);
		} else if (level > 1) {
			printcurrentlevel(root.left, level - 1);
			printcurrentlevel(root.right, level - 1);
		}

	}

	private static void LevelprintTravese(tree root) {

		if (root == null)
			return;

		Queue<tree> q = new LinkedList<>();
		q.add(root);
		// q.add(null);

		while (!q.isEmpty()) {
			tree curr = q.poll();
			if (curr == null) {
				if (q.isEmpty()) {
					return;
				} else {
					q.add(curr);
				}
				System.out.println(); /// print each level in new line
				continue;
			}
			System.out.print(" " + curr.data);

			if (curr.left != null) {
				q.add(curr.left);
			}
			if (curr.right != null) {
				q.add(curr.right);
			}

		}

	}

	private static List<List<Integer>> LevelprintTraveselist(tree root) {

		if (root == null) {
			return new ArrayList<List<Integer>>();
		}

		List<List<Integer>> list = new ArrayList<>();
		Queue<tree> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> internalList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				tree node = q.poll();
				internalList.add(node.data);
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
			}

			list.add(internalList);

		}

		return list;

	}

	private static List<Integer> leftViewofTheTree_2(tree root) {

		if (root == null) {
			return new ArrayList<Integer>();
		}
		List<Integer> list = new ArrayList<>();

		Queue<tree> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {

			int size = q.size();
			list.add(q.peek().data);

			while (size > 0) {

				tree curr = q.poll();

				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
				size--;
			}

		}

		return list;
	}

	private static List<Integer> leftViewofTheTree(tree root) {

		if (root == null) {
			return new ArrayList<Integer>();
		}
		List<Integer> list = new ArrayList<>();

		Queue<tree> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {

			int size = q.size();
			list.add(q.peek().data);

			while (size > 0) {

				tree curr = q.poll();

				if (curr.left != null) {
					q.add(curr.left);
				}
				if (curr.right != null) {
					q.add(curr.right);
				}
				size--;
			}

		}

		return list;
	}

	private static List<Integer> rightViewofTheTree(tree root) {

		if (root == null) {
			return new ArrayList<Integer>();
		}
		List<Integer> list = new ArrayList<>();
		Queue<tree> q = new LinkedList<tree>();
		q.add(root);

		while (!q.isEmpty()) {

			int size = q.size();
			list.add(q.peek().data);

			while (size > 0) {

				tree curr = q.poll();
				if (curr.right != null) {
					q.add(curr.right);
				}

				if (curr.left != null) {
					q.add(curr.left);
				}
				size--;
			}

		}

		return list;
	}

	private static Map<Integer, Integer> topViewofTheTree(tree root) {

		if (root == null) {
			return new HashMap<>();
		}

		Map<Integer, Integer> topview = new TreeMap<>();

		Queue<Nodetree> q = new LinkedList<>();
		q.add(new Nodetree(root, 0));
		while (!q.isEmpty()) {

			Nodetree curr = q.poll();
			int h = curr.data;
			if (!topview.containsKey(h))
				topview.put(h, curr.root.data);
			if (curr.root.left != null) {
				q.add(new Nodetree(curr.root.left, h - 1));
			}
			if (curr.root.right != null) {
				q.add(new Nodetree(curr.root.right, h + 1));
			}

		}

		return topview;

	}

	private static Map<Integer, Integer> bootomViewofTheTree(tree root) {

		if (root == null) {
			return new HashMap<>();
		}

		Map<Integer, Integer> topview = new TreeMap<>();

		Queue<Nodetree> q = new LinkedList<>();
		q.add(new Nodetree(root, 0));

		while (!q.isEmpty()) {

			Nodetree curr = q.poll();
			int h = curr.data;
			// if (!topview.containsKey(h))
			topview.put(h, curr.root.data);

			if (curr.root.left != null) {
				q.add(new Nodetree(curr.root.left, h - 1));
			}

			if (curr.root.right != null) {
				q.add(new Nodetree(curr.root.right, h + 1));
			}

		}

		return topview;

	}

	private static List<List<Integer>> ZigzagViewofTheTree(tree root) {

		ArrayList<List<Integer>> list = new ArrayList<>();

		if (root == null)
			return list;
		Queue<tree> q = new LinkedList<>();
		q.add(root);
		boolean odd = true;
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> internalList = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				tree node = q.remove();
				internalList.add(node.data);
				if (node.left != null)
					q.add(node.left);
				if (node.right != null)
					q.add(node.right);
			}
			if (odd) {
				list.add(internalList);
				odd = false;
			} else {
				Collections.reverse(internalList);
				list.add(internalList);
				odd = true;
			}
		}
		return list;
	}

	private static List<Integer> Diagonal_Traversal(tree root) {

		List<Integer> list = new ArrayList<>();

		if (root == null)
			return list;

		Queue<tree> q = new LinkedList<>();
		q.add(root);
		while (!q.isEmpty()) {

			tree node = q.poll();
			// System.out.println("node" + node.data);
			while (node != null) {

				// System.out.println("noder" + node.data);

				if (node.left != null) {
					q.add(node.left);
				}
				list.add(node.data);
				node = node.right;
			}
		}
		return list;
	}

	private static List<Integer> leafNode(tree root, List<Integer> list) {

		if (root == null)
			return list;
		leafNode(root.left, list);

		if (root.left == null && root.right == null) {
			list.add(root.data);
		}
		leafNode(root.right, list);

		return list;

	}

	private static List<Integer> rightTree_boundary_Traversal(tree root, List<Integer> list) {

		if (root == null)
			return list;
		//System.out.println("right"+root.data);
		if (root.right != null) {
			rightTree_boundary_Traversal(root.right, list);
			list.add(root.data);
			System.out.println("right->"+root.data);

		} else if (root.left != null) {
			rightTree_boundary_Traversal(root.left, list);
			list.add(root.data);
		}

		return list;
	}

	private static List<Integer> leftTree_boundary_Traversal(tree root, List<Integer> list) {

		if (root == null)
			return list;
		
		//System.out.println("left"+root.data);
		if (root.left != null) {
			//System.out.println("rootl"+root.data);
			list.add(root.data);
			leftTree_boundary_Traversal(root.left, list);
		} else if (root.right != null) {
			//System.out.println("rootr"+root.data);
			list.add(root.data);
			leftTree_boundary_Traversal(root.right, list);
		}

		return list;
	}

	private static List<Integer> boundary_Traversal(tree root) {

		if (root == null)
			return new ArrayList<Integer>();

		List<Integer> list = new ArrayList<>();

		list.add(root.data);
		list = leftTree_boundary_Traversal(root.left, list);
		leafNode(root, list);
		list = rightTree_boundary_Traversal(root.right, list);

		return list;

	}
	
	private static tree solve_doublylist(tree head, tree prev, tree root ,int f) {
				
		if(root==null) return root;
		solve_doublylist(head,prev,root.left,f);
		if(f==0)
		{
			f=1;
			System.out.println("hello data");
			head=root;
			prev=root;
			System.out.println("head->");
		}
		else {
			System.out.println("hello data2");
			prev.right=root;
			prev.right.left=prev;
			prev=prev.right;
		}
		
		solve_doublylist(head,prev,root.right,f);
		
		return head;
		
	}
	static int f=0;
	private static tree tree_todoublylist(tree root) {
		// TODO Auto-generated method stub
		tree head=null;
		tree prev=null;
		solve_doublylist(head,prev,root,f);
		return head;
	}



	

}
