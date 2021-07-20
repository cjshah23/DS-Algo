package com.stack;

import java.util.Scanner;

public class StackImpl {
	public static void main(String[] args) {

		// n-> size ; ch-> user's choice ; e-> user input element
		int n, ch, e;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		n = in.nextInt();
		Stack stack = new Stack(n);

		do {
			System.out.println("\n1. Push     2. Pop     3. Print     4. Peak     0. Exit\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				if (stack.isFull() == false) {
					System.out.println("Enter Element : ");
					e = in.nextInt();
					stack.push(e);
				} else
					System.out.println("Stack Overflow");
				break;
			case 2:
				if (stack.isEmpty() == false)
					System.out.println("Popped element : " + stack.pop());
				else
					System.out.println("Stack Underflow");
				break;
			case 3:
				System.out.println("Elements of stack are :");
				stack.printStack();
				break;
			case 4:
				if (stack.isEmpty() == false)
					System.out.println("Element at top : " + stack.atPeak());
				else
					System.out.println("Stack Underflow");
				break;
			case 0:
				System.out.println("Exiting. . . Bye Bye!");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		} while (ch != 0);
		in.close();
	}
}
