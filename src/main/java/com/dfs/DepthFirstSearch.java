package com.dfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class DepthFirstSearch {
	private int vertices;
	private LinkedList<Integer> adjList[];

	@SuppressWarnings("unchecked")
	public
	DepthFirstSearch(int vertices) {
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for (int i = 0; i < vertices; ++i) {
			adjList[i] = new LinkedList<>();
		}
	}

	// method to add an edge to a graph(adjacency list)
	public void addEdge(int v, int w) {
		adjList[v].add(w);
	}

	public void DFSTraverseByRecursion(int vertex, boolean visited[]) {
		
		// Base case
		if (visited[vertex]) {
			return;
		}
		
		// mark the current node as visited and print it
		visited[vertex] = true;
		System.out.print(vertex + " ");

		// move to next node/vertex and recurse for all vertices
		Iterator<Integer> itr = adjList[vertex].listIterator();
		while (itr.hasNext()) {
			int next = itr.next();
			if(!visited[next]) {
				DFSTraverseByRecursion(next, visited);
			}
			
		}
	}

	public void DFSByRecursion(int vertex) {
		// Initialize all vertices as not visited
		boolean visited[] = new boolean[vertices];

		DFSTraverseByRecursion(vertex, visited);
	}

	public void DFSByIteration(int vertex) {
		boolean visited[] = new boolean[vertices];

		// initialize a stack and push the root node to the stack
		Stack<Integer> stack = new Stack<>();
		stack.push(vertex);

		int nextNode = 0;

		while (!stack.empty()) {
			vertex = stack.peek();
			stack.pop();

			if (visited[vertex] == false) {
				System.out.print(vertex + " ");
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

	void BFSByIteration() {

	}
}