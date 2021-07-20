package com.queue;

public class CircularQ {

	int rear, front, size, q[], count;

	// constructor
	public CircularQ(int size) {
		this.size = size;
		rear = -1;
		front = 0;
		q = new int[size];
		count = 0;
	}

	// insert element inside queue
	public void enqueue(int e) {
		count++;
		rear = (rear + 1) % size;
		q[rear] = e;
	}

	// delete element from queue
	public int dequeue() {
		count--;
		int temp = q[front];
		front = (front + 1) % size;
		return temp;
	}

	// check if queue is full
	public boolean isFull() {
		boolean ans = (count == size) ? true : false;
		return ans;
	}

	// check if queue is empty
	public boolean isEmpty() {
		boolean ans = count == 0 ? true : false;
		return ans;
	}

	// printing the queue from front to rear
	public void printQ() {
		int c = 0, i = front;
		while (c < count) {
			System.out.println(q[i]);
			i = (i + 1) % size;
			c++;
		}
	}
}
