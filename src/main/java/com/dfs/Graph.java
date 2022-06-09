package com.dfs;

import java.util.LinkedList;

public class Graph {
	private int vertices;
	private LinkedList<Integer> adjList[];

	@SuppressWarnings("unchecked")
	Graph(int vertices) {
		this.vertices = vertices;
		adjList = new LinkedList[vertices];
		for (int i = 0; i < vertices; ++i) {
			adjList[i] = new LinkedList<Integer>();
		}
	}
	
	//method to add an edge to a graph(adjacency list)
	void addEdge(int v, int w) {
		adjList[v].add(w);
	}

	public int getVertices() {
		return vertices;
	}

	public LinkedList<Integer>[] getAdjList() {
		return adjList;
	}

}