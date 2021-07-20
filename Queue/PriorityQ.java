package com.queue;

public class PriorityQ {

	int rear, front, size, q[];

	// constructor
	public PriorityQ(int size) {
		this.size = size;
		rear = -1;
		front = 0;
		q = new int[size];
	}

	// insert element inside queue ascending priority
	public void enqueue(int e) {
		int i, j, t;
		rear++;
		q[rear] = e;
		for (i = front; i < rear; i++) {
			for (j = front; j < rear; j++) {
				if (q[j] > q[j + 1]) {
					t = q[j];
					q[j] = q[j + 1];
					q[j + 1] = t;
				}
			}
		}
	}

	// delete element from queue
	public int dequeue() {
		int temp = q[front];
		front++;
		return temp;
	}

	// check if queue is full
	public boolean isFull() {
		boolean ans = (rear == size - 1) ? true : false;
		return ans;
	}

	// check if queue is empty
	public boolean isEmpty() {
		boolean ans = front > rear ? true : false;
		return ans;
	}

	// printing the queue from front to rear
	public void printQ() {
		for (int i = front; i <= rear; i++)
			System.out.println(q[i]);
	}
}
