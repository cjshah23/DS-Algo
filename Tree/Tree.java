// ADT of Binary Search Tree(BST) using recursion

package com.tree;

public class Tree {

	// inner class Node
	class Node {
		int data;
		Node left, right;

		public Node(int e) {
			data = e;
		}
	}

	Node root;

	public Tree() {
		root = null;
	}

	// Inserting node. Here r -> root, n -> new node
	void insert(Node r, Node n) {
		if (root == null) {
			root = n;
		} else {
			if (n.data < r.data) {
				if (r.left == null)
					r.left = n;
				else
					insert(r.left, n);
			} else {
				if (r.right == null)
					r.right = n;
				else
					insert(r.right, n);
			}
		}
	}

	// In-order Traversal (L-P-R)
	void inOrder(Node r) {
		if (r != null) {
			inOrder(r.left);
			System.out.print(r.data + "\t");
			inOrder(r.right);
		}
	}

	// Pre-order Traversal (L-P-R)
	void preOrder(Node r) {
		if (r != null) {
			System.out.print(r.data + "\t");
			preOrder(r.left);
			preOrder(r.right);
		}
	}

	// Post-order Traversal (L-P-R)
	void postOrder(Node r) {
		if (r != null) {
			postOrder(r.left);
			postOrder(r.right);
			System.out.print(r.data + "\t");
		}
	}

	// Count the number of nodes using traversal. Here c is always 0
	int c = 0;

	int countN(Node r) {
		if (r != null) {
			c++;
			countN(r.left);
			countN(r.right);
		}
		return c;
	}
}