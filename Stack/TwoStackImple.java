package com.stack;

import java.util.Scanner;

public class TwoStackImple {
	public static void main(String[] args) {

		// n-> size ; ch-> user's choice ; e-> user input element
		int n, ch, e;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		n = in.nextInt();
		TwoStack ts = new TwoStack(n);
		do {
			System.out.println("\n1. Push_A\t2. Pop_A\t3. Print_A\t4. Peek_A");
			System.out.println("5. Push_B\t6. Pop_B\t7. Print_B\t8. Peek_B\n0. Exit\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				if (ts.isFull1() == false) {
					System.out.println("Insert in Stack_A : ");
					e = in.nextInt();
					ts.push1(e);
				} else
					System.out.println("Stack_A Overflow");
				break;
			case 2:
				if (ts.isEmpty1() == false)
					System.out.println("Deleted from Stack_A : " + ts.pop1());
				else
					System.out.println("Stack_A Underflow");
				break;
			case 3:
				System.out.println("Stack_A :");
				ts.printStack1();
				break;
			case 4:
				if (ts.isEmpty1() == false)
					System.out.println("Top of Stack_A : " + ts.atPeek1());
				else
					System.out.println("Stack_A Underflow");
				break;
			case 5:
				if (ts.isFull2() == false) {
					System.out.println("Insert in Stack_B : ");
					e = in.nextInt();
					ts.push2(e);
				} else
					System.out.println("Stack_B Overflow");
				break;
			case 6:
				if (ts.isEmpty2() == false)
					System.out.println("Deleted from Stack_B : " + ts.pop2());
				else
					System.out.println("Stack_B Underflow");
				break;
			case 7:
				System.out.println("Stack_B :");
				ts.printStack2();
				break;
			case 8:
				if (ts.isEmpty2() == false)
					System.out.println("Top of Stack_B : " + ts.atPeek2());
				else
					System.out.println("Stack_B Underflow");
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
