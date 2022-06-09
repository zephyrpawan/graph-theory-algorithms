package com.dfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class Graph {
	private int vertices;
	private LinkedList<Integer> adjList[];

	@SuppressWarnings("unchecked")
	Graph(int vertices) {
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for (int i = 0; i < vertices; ++i) {
			adjList[i] = new LinkedList<>();
		}
	}

	// method to add an edge to a graph(adjacency list)
	void addEdge(int v, int w) {
		adjList[v].add(w);
	}

	void DFSTraverseByRecursion(int vertex, boolean visited[]) {
		// mark the current node as visited and print it
		visited[vertex] = true;
		System.out.println(vertex + " ");

		// move to next node/vertex and recurse for all vertices
		Iterator<Integer> itr = adjList[vertex].listIterator();
		while (itr.hasNext()) {
			int next = itr.next();
			if (!visited[next]) {
				DFSTraverseByRecursion(next, visited);
			}
		}
	}

	void DFSByRecursion(int vertex) {
		// Initialize all vertices as not visited
		boolean visited[] = new boolean[vertices];

		DFSTraverseByRecursion(vertex, visited);
	}

	void DFSByIteration(int vertex) {
		boolean visited[] = new boolean[vertices];

		// initialize a stack and push the root node to the stack
		Stack<Integer> stack = new Stack<>();
		stack.push(vertex);

		int nextNode = 0;

		while (!stack.empty()) {
			vertex = stack.peek();
			stack.pop();

			if (visited[vertex] == false) {
				System.out.println(vertex + " ");
				visited[vertex] = true;
			}

			Iterator<Integer> itr = adjList[vertex].listIterator();
			while (itr.hasNext()) {
				nextNode = itr.next();
				if (!visited[nextNode]) {
					stack.push(nextNode);
				}
			}
		}

	}
}