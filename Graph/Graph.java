package com.graph;

import java.util.Arrays;
import java.util.Scanner;

public class Graph {

	int adjMat[][], v, vl[];

	Scanner in = new Scanner(System.in);

	public Graph(int no_of_nodes) {
		v = no_of_nodes;
		adjMat = new int[v][v];
		// vl->array of visited nodes, if visited : 1 else 0
		vl = new int[v];
		Arrays.fill(vl, 0);
		System.out.println("If path exists, press 1, else 0.");
		for (int s = 0; s < v; s++) {
			for (int d = 0; d < v; d++) {
				System.out.print("Path from " + s + " to " + d + " : ");
				adjMat[s][d] = in.nextInt();
				System.out.print("\n");
			}
		}
	}

	// since DFS() is recursive, it uses stack internally i.e Inclusive Stack
	public void DFS(int start_node) {
		vl[start_node] = 1;
		System.out.print(start_node + " - ");
		for (int i = 0; i < v; i++) {
			while (adjMat[start_node][i] == 1 && vl[i] == 0)
				DFS(i);
		}
	}

	public void BFS(int start_node) {
		int q[], front = 0, rear = -1, e;
		vl[start_node] = 1;
		q = new int[v];

		// Enqueue, since rear is incremented.
		q[++rear] = start_node;

		// until elements are left in list
		while (front <= rear) {
			// Dequeue, since front is incremented
			e = q[front++];
			System.out.print(e + " - ");
			for (int i = 0; i < v; i++) {
				if (adjMat[e][i] == 1 && vl[i] == 0) {
					q[++rear] = i;
					vl[i] = 1;
				}
			}
		}
		System.out.print("\n");
	}
}
