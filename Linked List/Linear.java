package com.linkedList;

import com.stack.Stack;

public class Linear {

	class Node {
		int data;
		// Self Referring Structure i.e referring to someone of same type
		Node next;

		// constructor
		public Node(int e) {
			data = e;
			next = null;
		}
	}

	Node root;
	int count=0;

	// constructor
	public Linear() {
		root = null;
	}

	// insert leftmost
	public void insertL(int e) {
		Node n = new Node(e);
		if (root == null) {
			root = n;
			++count;
		}
		else {
			n.next = root;
			root = n;
			++count;
		}
	}

	// delete leftmost
	public void deleteL() {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node temp = root;
			root = root.next;
			System.out.println("Deleted : " + temp.data);
			--count;
		}
	}

	// insert rightmost
	public void insertR(int e) {
		Node n = new Node(e);
		if (root == null) {
			root = n;
			++count;
		}
		else {
			Node temp = root;
			while (temp.next != null)
				temp = temp.next;
			temp.next = n;
			++count;
		}
	}

	// delete rightmost
	public void deleteR() {
		if (root == null)
			System.out.println("Empty List");
		// use anchoring in order to find 2nd last node. Here t2 is anchor.
		else {
			Node temp = root, t2 = root;
			while (temp.next != null) {
				t2 = temp;
				temp = temp.next;
			}
			t2.next = null;
			System.out.println("Deleted : " + temp.data);
			--count;
		}
	}

	// printing from root to last
	public void printList() {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node temp = root;
			while (temp != null) {
				System.out.print(temp.data + "   ");
				temp = temp.next;
			}
			System.out.println("\n");
			System.out.println("Number of Nodes : "+count);
		}
	}

	// search specific data
	public void searchValue(int value) {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node temp = root;
			while (temp != null) {
				if (temp.data == value) {
					System.out.println("Found");
					break;
				}
				else if(temp.next==null) {
					System.out.println("NOT Found");
					break;
				}
				else
					temp = temp.next;
			}
		}
	}

	// delete specific data
	public void deleteValue(int value) {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node temp = root, t2 = root;
			while (temp.data != value && temp != null) {
				t2 = temp;
				temp = temp.next;
				if(temp==null)
					break;
			}
			if (temp == null)
				System.out.println("NOT Found");
			// if value is at root node
			else{
				if (temp == root)
				root = root.next;
				// if value is at last node
				else if (temp.next == null)
					t2.next = null;
				// if value is at other nodes
				else
					t2.next = temp.next;
				System.out.println("Deleted : "+temp.data);
			}
		}
	}
	
	// Give count of nodes
	public int giveCount() {
		return count;
	}
	
	// Reverse List using Stack
	public void reverseList() {
		if (root == null)
			System.out.println("Empty List");
		else {
			Stack stack = new Stack(count);
			Node temp = root;
			while (temp != null) {
				stack.push(temp.data);
				temp = temp.next;
			}
			System.out.println("Reverse List : ");
			stack.printStack();
		}
	}
}
