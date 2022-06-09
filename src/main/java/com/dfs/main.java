package com.dfs;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GraphDFS graph  = new GraphDFS(4);
		graph.addEdge(0, 1);
		graph.addEdge(0, 2);
		graph.addEdge(1, 2);
		graph.addEdge(2, 3);
		graph.addEdge(2, 0);
		graph.addEdge(3, 3);
		
		System.out.println("DFS in GraphDFS");
		graph.DFSByRecursion(1);
		System.out.println();
		graph.DFSByIteration(2);
		System.out.println('\n');
		
		//Count Strongly Connected Components
		GraphSCC graphSCC  = new GraphSCC(18);
		graphSCC.addEdge(0, 8);
		graphSCC.addEdge(0, 4);
		graphSCC.addEdge(0, 13);
		graphSCC.addEdge(0, 14);
		graphSCC.addEdge(1, 5);
		graphSCC.addEdge(2, 9);
		graphSCC.addEdge(2, 15);
		graphSCC.addEdge(3, 9);
		graphSCC.addEdge(4, 0);
		graphSCC.addEdge(4, 8);
		graphSCC.addEdge(5, 1);
		graphSCC.addEdge(5, 16);
		graphSCC.addEdge(5, 17);
		graphSCC.addEdge(6, 7);
		graphSCC.addEdge(6, 11);
		graphSCC.addEdge(7, 6);
		graphSCC.addEdge(7, 11);
		graphSCC.addEdge(8, 0);
		graphSCC.addEdge(8, 4);
		graphSCC.addEdge(8, 14);
		graphSCC.addEdge(9, 15);
		graphSCC.addEdge(9, 3);
		graphSCC.addEdge(9, 2);
		graphSCC.addEdge(10, 15);
		graphSCC.addEdge(11, 7);
		graphSCC.addEdge(11, 6);
		graphSCC.addEdge(13, 0);
		graphSCC.addEdge(13, 14);
		graphSCC.addEdge(14, 0);
		graphSCC.addEdge(14, 8);
		graphSCC.addEdge(14, 13);
		graphSCC.addEdge(15, 10);
		graphSCC.addEdge(15, 9);
		graphSCC.addEdge(15, 2);
		graphSCC.addEdge(16, 5);
		graphSCC.addEdge(17, 5);
		
		System.out.println("DFS in GraphSCC");
		//graphSCC.DFS(2);
		System.out.println('\n');
		
		int sccCount = graphSCC.findStronglyConnectedComponents().get("SccCount")[0];
		int components[] = graphSCC.findStronglyConnectedComponents().get("SCC");
		System.out.println();
		System.out.print("Strongly connected components in GraphSCC: ");
		for(int component:components) {
			System.out.print(component + " ");
		}
		System.out.println();
		System.out.println("Number of Strongly connected components in GraphSCC: " + sccCount);

	}

}
