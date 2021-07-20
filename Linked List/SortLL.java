package com.linkedList;

import java.util.Scanner;

import com.linkedList.Linear.Node;

public class SortLL {
	public static void main(String[] args) {

		// ch-> user's choice ; e-> user input element
		int ch, e;
		Scanner in = new Scanner(System.in);
		Linear l1 = new Linear();

		do {
			System.out.println("\n1. Insert Data\t2. Print List\t0. Sort List\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Data : ");
				e = in.nextInt();
				l1.insertR(e);
				break;
			case 2:
				System.out.println("Current List : ");
				l1.printList();
				break;
			case 0:
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		} while (ch != 0);
		in.close();

		// Sorting List using Bubble Sort.
		if (l1.root != null) {
			int temp;
			for (Node t1 = l1.root; t1 != null; t1 = t1.next) {
				for (Node t2 = t1.next; t2 != null; t2 = t2.next) {

					if (t1.data > t2.data) {
						temp = t1.data;
						t1.data = t2.data;
						t2.data = temp;
					}
				}
			}
		}
		
//		
//		if (l1.root != null) {
//			Node t1 = l1.root;
//			Node t2 = null;
//			int temp;
//			while (t1 != null) {
//				t2 = t1.next;
//				while (t2 != null) {
//					if (t1.data > t2.data) {
//						temp = t1.data;
//						t1.data = t2.data;
//						t2.data = temp;
//					}
//					t2 = t2.next;
//				}
//				t1 = t1.next;
//			}
//		} 
		else
			System.out.println("List is Empty");

		System.out.print("Sorted List : ");
		l1.printList();

	}
}