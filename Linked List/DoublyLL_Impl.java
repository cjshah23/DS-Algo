package com.linkedList;

import java.util.Scanner;

public class DoublyLL_Impl {
	public static void main(String[] args) {

		// ch-> user's choice ; e-> user input element
		int ch, e;
		Scanner in = new Scanner(System.in);
		Doubly d = new Doubly();

		do {
			System.out.println("\n1. Insert Right\t2. Delete Right\n3. Insert Left\t4. Delete Left\n5. Print List\t0. Exit\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Insert value at Right : ");
				e = in.nextInt();
				d.insertR(e);
				break;
			case 2:
				d.deleteR();
				break;
			case 3:
				System.out.println("Insert value at Left : ");
				e = in.nextInt();
				d.insertL(e);
				break;
			case 4:
				d.deleteL();
				break;
			case 5:
				System.out.print("List : ");
				d.printList();
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