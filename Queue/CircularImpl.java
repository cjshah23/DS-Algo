package com.queue;

import java.util.Scanner;

public class CircularImpl {
	public static void main(String[] args) {

		// n-> size ; ch-> user's choice ; e-> user input element
		int n, ch, e;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		n = in.nextInt();
		CircularQ cq = new CircularQ(n);

		do {
			System.out.println("\n1. Enqueue\n2. Dequeue\n3. Print\n0. Exit\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				if (cq.isFull() == false) {
					System.out.println("Enter Element : ");
					e = in.nextInt();
					cq.enqueue(e);
				} else
					System.out.println("Queue is Full");
				break;
			case 2:
				if (cq.isEmpty() == false)
					System.out.println("Dequeued element : " + cq.dequeue());
				else
					System.out.println("Queue is Empty");
				break;
			case 3:
				System.out.println("Elements in Queue are :");
				cq.printQ();
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
