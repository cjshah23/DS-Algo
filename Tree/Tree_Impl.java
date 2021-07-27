package com.tree;

import com.tree.Tree.Node;

public class Tree_Impl {
	public static void main(String[] args) {
		Tree t1 = new Tree();
		Node root = t1.new Node(100);
		t1.insert(null, root);
		t1.insert(root, t1.new Node(50));
		t1.insert(root, t1.new Node(80));
		t1.insert(root, t1.new Node(150));
		t1.insert(root, t1.new Node(180));
		t1.insert(root, t1.new Node(60));
		t1.insert(root, t1.new Node(99));
		System.out.println("Count of Nodes : " + t1.countN(root));
		System.out.println("\nIn-Order : ");
		t1.inOrder(root);
		System.out.println("\n\nPost-Order : ");
		t1.postOrder(root);
		System.out.println("\n\nPre-Order : ");
		t1.preOrder(root);
	}
}