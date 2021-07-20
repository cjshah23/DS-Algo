package com.queue;

import java.util.Scanner;

public class TwoLQ_Impl {
	public static void main(String[] args) {

		// n-> size ; ch-> user's choice ; e-> user input element
		int n, ch, e;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		n = in.nextInt();
		TwoLQ tlq = new TwoLQ(n);

		do {
			System.out.println(
					"\n1. Enqueue_A     2. Dequeue_A    3. Print_A\n4. Enqueue_B     5. Dequeue_B    6. Print_B     0. Exit\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				if (tlq.isFull1() == false) {
					System.out.println("Insert in Queue_A : ");
					e = in.nextInt();
					tlq.enqueue1(e);
				} else
					System.out.println("Queue_A is Full");
				break;
			case 2:
				if (tlq.isEmpty1() == false)
					System.out.println("Delete from Queue_A : " + tlq.dequeue1());
				else
					System.out.println("Queue_A is Empty");
				break;
			case 3:
				System.out.println("Queue_A :");
				tlq.printQ1();
				break;
			case 4:
				if (tlq.isFull2() == false) {
					System.out.println("Insert in Queue_B : ");
					e = in.nextInt();
					tlq.enqueue2(e);
				} else
					System.out.println("Queue_B is Full");
				break;
			case 5:
				if (tlq.isEmpty2() == false)
					System.out.println("Delete from Queue_B : " + tlq.dequeue2());
				else
					System.out.println("Queue_B is Empty");
				break;
			case 6:
				System.out.println("Queue_B :");
				tlq.printQ2();
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
