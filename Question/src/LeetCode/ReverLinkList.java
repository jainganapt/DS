/*
 * package LeetCode;
 * 
 * public class ReverLinkList {
 * 
 * public static void main(String arg[]) { List l = null; l = createNewnode(l,
 * 1); l = createNewnode(l, 2); l = createNewnode(l, 3); l = createNewnode(l,
 * 4); l = createNewnode(l, 5);
 * 
 * printNode(l);
 * 
 * revList(l);
 * 
 * }
 * 
 * private static List revList(List l) {
 * 
 * if (l == null || l.next == null) return l;
 * 
 * List p = null; while (l.next != null) { l = revList(l.next); l = l.next;
 * System.out.println("=>" + l.val);
 * 
 * p = createNewnode(p, l.val); return p;
 * 
 * }
 * 
 * return p; }
 * 
 * private static List createNewnode(List l, int i) { List p = l; List dummy =
 * new List(i); if (l != null) { while (p.next != null) { p = p.next; } p.next =
 * dummy; return l; }
 * 
 * return dummy; }
 * 
 * private static void printNode(List p) { while (p != null) {
 * System.out.print(p.val + "=>"); p = p.next; } }
 * 
 * }
 * 
 * class List { int val; List next;
 * 
 * List(int x) { val = x; } }
 */