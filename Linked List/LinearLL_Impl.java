package com.linkedList;

import java.util.Scanner;

public class LinearLL_Impl {
	public static void main(String[] args) {

		// ch-> user's choice ; e-> user input element
		int ch, e;
		Scanner in = new Scanner(System.in);
		Linear l = new Linear();

		do {
			System.out.println("\n1. Insert Right\t2. Delete Right\n3. Insert Left\t4. Delete Left\n5. Search Value\t6. Delete Value\n7. Print List\t8. Give Count\t0. Exit\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Insert value at Right : ");
				e = in.nextInt();
				l.insertR(e);
				break;
			case 2:
				l.deleteR();
				break;
			case 3:
				System.out.println("Insert value at Left : ");
				e = in.nextInt();
				l.insertL(e);
				break;
			case 4:
				l.deleteL();
				break;
			case 5:
				System.out.println("Enter value to search : ");
				e = in.nextInt();
				l.searchValue(e);
				break;
			case 6:
				System.out.println("Enter value to delete : ");
				e = in.nextInt();
				l.deleteValue(e);
				break;
			case 7:
				System.out.print("List : ");
				l.printList();
				break;
			case 8:
				System.out.print(l.giveCount());
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