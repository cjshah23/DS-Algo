package com.linkedList;

public class Circular {

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

	Node root, last;

	// constructor
	public Circular() {
		root = null;
		last=null;
	}

	// insert leftmost
	public void insertL(int e) {
		Node n = new Node(e);
		if (root == null) {
			root = n;
			last=n;
			last.next=root;
		}
		else {
			n.next = root;
			root = n;
			last.next=root;
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
		}
	}

	// insert rightmost
	public void insertR(int e) {
		Node n = new Node(e);
		if (root == null) {
			root = n;
			last=n;
			last.next=root;
		}
		else {
			last.next=n;
			last=n;
			last.next=root;
		}
	}

	// delete rightmost
	public void deleteR() {
		if (root == null)
			System.out.println("Empty List");
		// use anchoring in order to hold 2nd last node. Here t2 is anchor.
		else {
			Node temp = root, t2=null;
			while (temp!= last) {
				t2 = temp;
				temp = temp.next;
			}
			last=t2;
			last.next=root;
			System.out.println("Deleted : " + temp.data);
		}
	}

	// printing from root to last
	public void printList() {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node temp = root;
			do {
				System.out.print(temp.data+"   ");
				System.out.print("\n");
				temp=temp.next;
			} while (temp!=root);
		}
	}

/*	// search specific data
	public void searchValue(int value) {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node temp =root;
			while (temp.next!=null) {
				if (temp.data==value) {
					System.out.println("Found");
					break;
				}
				temp=temp.next;
			}
			if(temp==null)
				System.out.println("NOT Found");
		}	
	}
	
	//delete specific data
	public void deleteValue(int value) {
		if (root == null)
			System.out.println("Empty List");
		else {
			Node temp = root, t2 = root;
			while (temp.data!=value && temp != null) {
				t2 = temp;
				temp = temp.next;
			}
			if (temp==null)
				System.out.println("NOT Found");
			//if value is at root node
			else if(temp==root)
				root=root.next;
			//if value is at last node
			else if(temp.next==null)
				t2.next=null;
			//if value is at other nodes
			else
				t2.next=temp.next;
			System.out.println("Deleted : "+temp.data);
		}
	}*/
}
