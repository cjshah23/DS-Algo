package com.linkedList;

public class DLL_Find_Mid {

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

	Node root, last;
	int count = 0;

	// constructor
	public DLL_Find_Mid() {
		root = null;
		last = null;
	}

	// insert leftmost
	public void insertL(int e) {
		Node n = new Node(e);
		if (root == null) {
			root = n;
			last = n;
		} else {
			n.right = root;
			root.left = n;
			root = n;
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

	// print mid element and index position
	public void midList() {
		if (root == null)
			System.out.println("Empty list");
		else if (root == last) {
			++count;
			System.out.println("Mid Index : " + count + "     Mid Element : " + root.data);
		} else {
			while (root.right != last && root != last) {
				++count;
				root = root.right;
				last = last.left;
			}
			System.out.println("Mid Index : " + count + "     Mid Element : " + root.data);
		}
	}
}