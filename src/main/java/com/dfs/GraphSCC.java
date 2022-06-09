package com.dfs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class GraphSCC {
	int vertices;
	LinkedList<Integer> adjList[];
	boolean visited[];
	int sccCount = 0;
	int components[];

	@SuppressWarnings("unchecked")
	GraphSCC(int vertices) {
		this.vertices = vertices;
		visited = new boolean[vertices];
		components = new int[vertices];
		adjList = new LinkedList[vertices];
		for (int i = 0; i < vertices; ++i) {
			adjList[i] = new LinkedList<Integer>();
		}
	}

	void addEdge(int v, int w) {
		adjList[v].add(w);
	}
	
	void DFS(int vertex, boolean visited[]) {
		//Base case
		if(visited[vertex]) {
			return;
		}
		
		//mark the vertex as visited and print it
		visited[vertex] = true;
		components[vertex] = sccCount;
		System.out.print(vertex + " ");
		
		//go to neighboring vertices and check
		Iterator<Integer> itr = adjList[vertex].listIterator();
		while(itr.hasNext()) {
			int nextVertex = itr.next();
			if(!visited[nextVertex]) {
				DFS(nextVertex, visited);
			}
		}
		
	}
	
	Map<String, int[]> findStronglyConnectedComponents() {
		Map<String, int[]> sccMap = new HashMap<String, int[]>();
		visited = new boolean[vertices];
		for(int i=0; i< vertices; i++) {
			if(!visited[i]) {
				sccCount++;
				DFS(i, visited);
			}
		}
		sccMap.put("SccCount", new int[] {sccCount});
		sccMap.put("SCC", components);
		return sccMap;
	}

}