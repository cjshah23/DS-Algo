package com.queue;

public class LinearQ {

	int rear, front, size, q[];

	// constructor
	public LinearQ(int size) {
		this.size = size;
		rear = -1;
		front = 0;
		q = new int[size];
	}

	// insert element inside queue
	public void enqueue(int e) {
		rear++;
		q[rear] = e;
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
