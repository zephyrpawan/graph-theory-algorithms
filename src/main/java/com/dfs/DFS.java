package com.dfs;

import java.util.Iterator;

public class DFS {

	void DFSByRecursion(Graph graph, int vertex) {
		// Mark all vertices as not visited to start with
		boolean visited[] = new boolean[graph.getVertices()];

		// mark the current node as visited and print it
		visited[vertex] = true;
		System.out.println(vertex + " ");

		// move to next node/vertex and recurse for all vertices
		Iterator<Integer> itr = graph.getAdjList()[vertex].listIterator();
		while (itr.hasNext()) {
			int next = itr.next();
			if (!visited[next]) {
				DFSByRecursion(graph, vertex);
			}
		}
	}
	
	void DFSByIteration(Graph graph, int vertex) {
		boolean vertices[] = new boolean[graph.getVertices()];
		
		//initialize a stack and push the root node to the stack
		
	}
}
