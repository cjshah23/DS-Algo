package com.linkedList;

import java.util.Scanner;

import com.linkedList.Linear.Node;

public class MergeTwoLL {
	public static void main(String[] args) {

		// ch-> user's choice ; e-> user input element
		int ch, e;
		Scanner in = new Scanner(System.in);
		Linear l1 = new Linear();
		Linear l2 = new Linear();
		Linear l3 = new Linear();

		System.out.println("Kindly insert data in Ascending order only");
		do {
			System.out.println(
					"\n1. Insert in List_A\t2. Insert in List_B\n3. Print List_A     4. Print List_B     0. Merge A & B\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Data in A : ");
				e = in.nextInt();
				l1.insertR(e);
				break;
			case 2:
				System.out.println("Enter Data in B : ");
				e = in.nextInt();
				l2.insertR(e);
				break;
			case 3:
				System.out.print("List_A : ");
				l1.printList();
				break;
			case 4:
				System.out.print("List_B : ");
				l2.printList();
				break;
			case 0:
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		} while (ch != 0);
		in.close();

		// Merging Logic
		Node t1 = l1.root;
		Node t2 = l2.root;
		while (t1 != null && t2 != null) {
				if (t1.data < t2.data) {
					l3.insertR(t1.data);
					t1 = t1.next;
				} else {
					l3.insertR(t2.data);
					t2 = t2.next;
				}
			}
			if (t1 == null) {
				while (t2 != null) {
					l3.insertR(t2.data);
					t2 = t2.next;
				}
			} else {
				while (t1 != null) {
					l3.insertR(t1.data);
					t1 = t1.next;
				}
		}
		System.out.println("Merged List C : ");
		l3.printList();
	}
}