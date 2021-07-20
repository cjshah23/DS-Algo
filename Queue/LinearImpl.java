package com.queue;

import java.util.Scanner;

public class LinearImpl {
	public static void main(String[] args) {

		// n-> size ; ch-> user's choice ; e-> user input element
		int n, ch, e;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter size");
		n = in.nextInt();
		LinearQ lq = new LinearQ(n);

		do {
			System.out.println("\n1. Enqueue\n2. Dequeue\n3. Print\n0. Exit\n");
			ch = in.nextInt();
			switch (ch) {
			case 1:
				if (lq.isFull() == false) {
					System.out.println("Enter Element : ");
					e = in.nextInt();
					lq.enqueue(e);
				} else
					System.out.println("Queue is Full");
				break;
			case 2:
				if (lq.isEmpty() == false)
					System.out.println("Dequeued element : " + lq.dequeue());
				else
					System.out.println("Queue is Empty");
				break;
			case 3:
				System.out.println("Elements in Queue are :");
				lq.printQ();
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
