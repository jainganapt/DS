package stack;

public class Min_Stack {

	int st[];
	int arr[];
	int stptr = 0;
	int arptr = 0;

	public Min_Stack() {

		st = new int[30000];
		arr = new int[30000];
	}

	public void push(int val) {

		st[stptr] = val;
		stptr++;

		System.out.println("puh stptr " + stptr);
		System.out.println("push arptr " + arptr);

		if (arptr == 0) {
			arr[arptr] = val;
		} else {

			if (arr[arptr - 1] > val) {
				arr[arptr] = val;
			} else {
				arr[arptr] = arr[arptr - 1];
			}
		}
		arptr++;

	}

	public void pop() {

		stptr--;
		arptr--;

		System.out.println("pop ->stptr " + stptr);
		System.out.println("pop-> arptr " + arptr);

	}

	public int top() {

		System.out.println("top-> stptr " + stptr);
		return st[stptr];
		// System.out.println("top ->stptr "+stptr);

	}

	public int getMin() {
		System.out.println("stptr-> stptr " + stptr + arr[--stptr]);
		return arr[stptr];
	}

	public static void main(String arg[]) {

		Min_Stack minStack = new Min_Stack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-1);
		minStack.getMin(); // return -3
		minStack.pop();
		minStack.top(); // return 0
		minStack.getMin(); // return -2

	}
}

/**
 * Your MinStack object will be instantiated and called as such: MinStack obj =
 * new MinStack(); obj.push(val); obj.pop(); int param_3 = obj.top(); int
 * param_4 = obj.getMin();
 */