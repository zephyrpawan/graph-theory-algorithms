package com.bfs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
	int vertices;
	LinkedList<Integer> adjList[];

	@SuppressWarnings("unchecked")
	public BreadthFirstSearch(int vertices) {
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for (int i = 0; i < vertices; i++) {
			adjList[i] = new LinkedList<Integer>();
		}
	}

	public void addEdge(int v, int w) {
		adjList[v].add(w);
	}

	public void BFS(int vertex) {
		Queue<Integer> q = new LinkedList<Integer>();
		boolean visited[] = new boolean[vertices];
		int nextVertex = 0;
		
		visited[vertex]=true;
		q.add(vertex);
		
		while(!q.isEmpty()) {
			vertex = q.poll();
			System.out.print(vertex + " ");
			
			Iterator<Integer> itr = adjList[vertex].listIterator();
			while (itr.hasNext()) {
				nextVertex = itr.next();
				if(!visited[nextVertex]) {
					visited[nextVertex]=true;
					q.add(nextVertex);
				}
			}
		}
		
	}

}
