//Implement two stacks in a single array

package com.stack;

public class TwoStack {
	int s[], size, top1, top2;

	// constructor
	TwoStack(int n) {
		size = n;
		top1 = -1;
		top2 = size;
		s = new int[size];
	}

	// inserting element in stack1
	public void push1(int e) {
		top1++;
		s[top1] = e;
	}

	// inserting element in stack2
	public void push2(int e) {
		top2--;
		s[top2] = e;
	}

	// removing element from stack1
	public int pop1() {
		int temp = s[top1];
		top1--;
		return temp;
	}

	// removing element from stack2
	public int pop2() {
		int temp = s[top2];
		top2++;
		return temp;
	}

	// check if stack1 is full
	public boolean isFull1() {
		boolean ans = (top1 < (top2 - 1)) ? false : true;
		return ans;
	}

	// check if stack2 is full
	public boolean isFull2() {
		return isFull1();
	}

	// check if stack1 is empty
	public boolean isEmpty1() {
		boolean ans = (top1 < 0) ? true : false;
		return ans;
	}

	// check if stack2 is empty
	public boolean isEmpty2() {
		boolean ans = (top2 == size) ? true : false;
		return ans;
	}

	// read the element at top of stack1
	public int atPeek1() {
		return s[top1];
	}

	// read the element at top of stack2
	public int atPeek2() {
		return s[top2];
	}

	// print stack1
	public void printStack1() {
		for (int i = top1; i >= 0; i--)
			System.out.print(s[i] + "\t");
		System.out.println("\n");
	}

	// print stack2
	public void printStack2() {
		for (int i = top2; i < size; i++)
			System.out.print(s[i] + "\t");
		System.out.println("\n");
	}
}
