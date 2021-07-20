package com.linkedList;

import java.util.Scanner;

public class DLL_Find_Mid_Impl {
	public static void main(String[] args) {

		// ch-> user's choice ; e-> user input element
		int ch, e;
		Scanner in = new Scanner(System.in);
		DLL_Find_Mid d = new DLL_Find_Mid();

		do {
			System.out.println("\n1. Insert Data\t2. Print List\t3. Mid-List\t0. Exit\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Insert Data : ");
				e = in.nextInt();
				d.insertL(e);
				break;
			case 2:
				System.out.print("List : ");
				d.printList();
				break;
			case 3:
				d.midList();
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