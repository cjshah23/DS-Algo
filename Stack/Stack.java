// Stack Data Structure ADT
package com.stack;

public class Stack {

	int s[], size, e, top;

	// constructor
	public Stack(int size) {
		this.size = size;
		top = -1;
		s = new int[size];
	}

	// inserting element in stack
	public void push(int e) {
		top++;
		s[top] = e;
	}

	// removing element from stack
	public int pop() {
		int temp = s[top];
		top--;
		return temp;
	}

	// check if stack Full
	public boolean isFull() {
		boolean ans = (top == size - 1) ? true : false;
		return ans;
	}

	// check if stack empty
	public boolean isEmpty() {
		boolean ans = (top == -1) ? true : false;
		return ans;
	}

	// finding the element at top of stack
	public int atPeak() {
		return s[top];
	}

	// printing the stack in LIFO order (top to bottom)
	public void printStack() {
		for (int i = top; i >= 0; i--)
			System.out.print(s[i]+"\t");
		System.out.println("\n");
	}
}
