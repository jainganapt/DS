/*
 * package LeetCode;
 * 
 * public class palindroneLinklist {
 * 
 * public static void main(String arg[]) {
 * 
 * node n1 = new node(1); n1.next = new node(2); n1.next.next = new node(1);
 * //n1.next.next.next = new node(1);
 * 
 * print(n1);
 * 
 * System.out.println(palidrone(n1)); }
 * 
 * private static boolean palidrone(node n1) {
 * 
 * System.out.println("=>"+n1.val); node fast = n1; node slow = n1;
 * 
 * while (fast!=null && fast.next != null ) {
 * 
 * System.out.println("fast"+fast.val); System.out.println("slow::"+slow.val);
 * 
 * fast = fast.next.next; slow = slow.next; }
 * 
 * fast = n1; slow=reverlist(slow); print(slow); while (slow != null) {
 * System.out.println("fast"+fast.val); System.out.println("slow::"+slow.val);
 * if (slow.val != fast.val) { return false; }
 * 
 * slow=slow.next; fast=fast.next; }
 * 
 * return true; }
 * 
 * private static node reverlist(node slow) {
 * 
 * node prev =null; while(slow!=null) {
 * 
 * node next=slow.next; slow.next=prev; prev=slow; slow=next; } return prev; }
 * 
 * private static void print(node n1) {
 * 
 * while (n1 != null) { System.out.println("::=>" + n1.val); n1 = n1.next; }
 * 
 * }
 * 
 * }
 * 
 * class node { int val; node next;
 * 
 * node(int x) { val = x; } }
 */