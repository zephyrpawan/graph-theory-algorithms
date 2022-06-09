package com.dfs;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Graph graph  = new Graph(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 0);
		graph.addEdge(3, 3);
		
		graph.DFSByRecursion(1);
		System.out.println('\n');
		graph.DFSByIteration(2);

	}

}
