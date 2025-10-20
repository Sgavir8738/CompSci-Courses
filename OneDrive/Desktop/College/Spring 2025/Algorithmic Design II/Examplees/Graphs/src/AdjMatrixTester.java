
public class AdjMatrixTester {

	public static void main(String[] args) {

		AdjMatrixGraph graph = new AdjMatrixGraph(7);
		
		graph.addEdge(0, 1, 1.0);
		graph.addEdge(0, 3, 1.0);
		
		graph.addEdge(1, 3, 1.0);
		
		graph.addEdge(2, 4, 1.0);
		graph.addEdge(2, 5, 1.0);
		graph.addEdge(2, 6, 1.0);
		
		graph.addEdge(3, 2, 1.0);
		graph.addEdge(3, 4, 1.0);
		
		graph.addEdge(4, 5, 1.0);
		graph.addEdge(4, 6, 1.0);
		
		graph.printAdjMatrix();
		graph.printDFS();
		graph.printBFS();

	}

}
