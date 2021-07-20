package com.linkedList;

import java.util.Scanner;

public class ReverseLL {
	public static void main(String[] args) {

		// ch-> user's choice ; e-> user input element
		int ch, e;
		Scanner in = new Scanner(System.in);
		Linear l = new Linear();

		do {
			System.out.println("\n1. Insert Data\t2. Print List\t3. Reverse List\t0. Exit\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter Data : ");
				e = in.nextInt();
				l.insertR(e);
				break;
			case 2:
				System.out.print("List : ");
				l.printList();
				break;
			case 3:
				l.reverseList();
				break;
			case 0:
				System.out.println("Exiting. . . Bye Bye!");
				break;
			default:
				System.out.println("Invalid Input");
				break;
			}
		} while (ch != 0);
		in.close();
	}
}