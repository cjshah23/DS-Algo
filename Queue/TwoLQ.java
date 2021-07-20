//Implement two linear queue in a single array (ADT)

package com.queue;

public class TwoLQ {

	int rear1, rear2, front1, front2, size, q[];

	// constructor
	public TwoLQ(int size) {
		this.size = size;
		rear1 = -1;
		rear2 = size;
		front1 = 0;
		front2 = size - 1;
		q = new int[size];
	}

	// Queue_1
	// insert element inside queue1
	public void enqueue1(int e) {
		rear1++;
		q[rear1] = e;
	}

	// delete element from queue1
	public int dequeue1() {
		int temp = q[front1];
		front1++;
		return temp;
	}

	// check if queue1 is full
	public boolean isFull1() {
		boolean ans = (rear1 == rear2 - 1) ? true : false;
		return ans;
	}

	// check if queue1 is empty
	public boolean isEmpty1() {
		boolean ans = front1 > rear1 ? true : false;
		return ans;
	}

	// printing queue1 from front1 to rear1
	public void printQ1() {
		for (int i = front1; i <= rear1; i++)
			System.out.print(q[i] + "\t");
		System.out.println("\n");
	}

	// Queue_2
	// insert element inside queue2
	public void enqueue2(int e) {
		rear2--;
		q[rear2] = e;
	}

	// delete element from queue2
	public int dequeue2() {
		int temp = q[front2];
		front2--;
		return temp;
	}

	// check if queue2 is full
	public boolean isFull2() {
		boolean ans = (rear2 == rear1 + 1) ? true : false;
		return ans;
	}

	// check if queue2 is empty
	public boolean isEmpty2() {
		boolean ans = front2 < rear2 ? true : false;
		return ans;
	}

	// printing the queue from front1 to rear1
	public void printQ2() {
		for (int i = front2; i >= rear2; i--)
			System.out.print(q[i] + "\t");
		System.out.println("\n");
	}
}
