package com.linkedList;

public class Doubly {

	class Node {
		int data;
		// Self Referring Structure i.e referring to someone of same type
		Node left, right;

		// constructor
		public Node(int e) {
			data = e;
			left = null;
			right = null;
		}
	}

	Node root;

	// constructor
	public Doubly() {
		root = null;
	}

	// insert leftmost
	public void insertL(int e) {
		Node n = new Node(e);
		if (root == null)
			root = n;
		else {
			n.right = root;
			root.left=n;
			root = n;
		}
	}

	// delete leftmost
	public void deleteL() {
		if (root == null)
			System.out.println("Empty List");
		else if (root.left==null && root.right==null) {
			System.out.println("Deleted : " + root.data);
			root=null;
		}
		else {
			Node temp = root;
			root = root.right;
			root.left=null;
			System.out.println("Deleted : " + temp.data);
		}
	}

	// insert rightmost
	public void insertR(int e) {
		Node n = new Node(e);
		if (root == null)
			root = n;
		else {
			Node temp = root;
			while (temp.right != null)
				temp = temp.right;
			temp.right = n;
			n.left=temp;
		}
	}

	// delete rightmost
	public void deleteR() {
		if (root == null)
			System.out.println("Empty List");
		//if list has only one node
		else if (root.left==null && root.right==null) {
			System.out.println("Deleted : " + root.data);
			root=null;
		}
		// use anchoring in order to find 2nd last node. Here t2 is anchor.
		else {
			Node temp = root;
			while (temp.right != null)
				temp = temp.right;
			Node t2=temp.left;
			t2.right=null;
			System.out.println("Deleted : " + temp.data);
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
				temp = temp.right;
			}
			System.out.println("\n");
		}
	}

/*	// search specific data
	public void searchValue(int value) {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node temp = root;
			while (temp.next != null) {
				if (temp.data == value) {
					System.out.println("Found");
					break;
				}
				temp = temp.next;
			}
			if (temp == null)
				System.out.println("NOT Found");
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
			}
			if (temp == null)
				System.out.println("NOT Found");
			// if value is at root node
			else if (temp == root)
				root = root.next;
			// if value is at last node
			else if (temp.next == null)
				t2.next = null;
			// if value is at other nodes
			else
				t2.next = temp.next;
			System.out.println("Deleted : " + temp.data);
		}
	}*/
}