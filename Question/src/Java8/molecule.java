package Java8;

import java.util.Scanner;

public class molecule {
	public int[] stack;
	public int index;

	public molecule() {
		stack = new int[100];
		index = -1;
	}

	public void push(int x) {
		stack[index + 1] = x;
		index++;
	}

	public int pop() {
		if (index == -1) {
			return -1;
		}
		int num = stack[index];
		index--;
		return num;
	}

	public int peek() {
		if (index == -1) {
			return 0;
		}
		return stack[index];
	}

	public static void main(String[] args) {
		molecule s1 = new molecule();
		Scanner kb = new Scanner(System.in);
		System.out.print("Enter the molecule: ");
		String input = kb.nextLine();
		int result = evaluate(input, s1);
		System.out.println("The Molecular Mass of " + input + " is " + result);
	}

	public static int evaluate(String s, molecule s1) {
		int answer = 0;
		int num = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '2':
			case '3':
				num = s1.pop();
				num *= Integer.parseInt(String.valueOf(c));
				s1.push(num);
				// System.out.println("num" + num);
				break;
			case 'C':
				s1.push(12);
				break;
			case 'H':
				s1.push(1);
				break;
			case 'O':
				s1.push(16);
				break;
			case '(':
				s1.push(0);
				break;
			case ')':
				int result = 0;
				while (s1.peek() != 0) {
					result += s1.pop();
				}
				int throwaway = s1.pop();
				// System.out.println("result" + result);
				s1.push(result);
				break;
			default:
				break;
			}
		}
		// System.out.println("s1"+s1.index);
		for (int i = 0; s1.index > -1; i--) {
			answer += s1.pop();
		}

		return answer;
	}
}