import java.util.*;
public class AdjMatrixGraph {
	//Sebastian Gaviria
	
	public static final int DEF_VERT_COUNT = 10;
	private double[][] adjMatrix;
	private LinkedList<Integer> markedList;
	private Queue<Integer> vQ;
	
	public AdjMatrixGraph()
	{
		init(DEF_VERT_COUNT);
	}
	public AdjMatrixGraph(int size)
	{
		init(size);
	}
	private void init(int size)
	{
		if (size > 0)
		{
			adjMatrix = new double[size][size];
			for (int i = 0; i < adjMatrix.length; i++)
			{
				for (int j = 0; j < adjMatrix[i].length; j++)
				{
					adjMatrix[i][j] = 0;
				}
			}
			markedList = new LinkedList<Integer>();
			vQ = new LinkedList<Integer>();
		}
		else
		{	//Initializes with default values
			init(DEF_VERT_COUNT);
		}
	}
	public void addEdge(int fromVertex, int toVertex, double weight)
	{
		if (isValid(fromVertex) && isValid(toVertex))
		{	//Add edge to vertex
			adjMatrix[fromVertex][toVertex] = weight;
		}
	}
	private boolean isValid(int index)
	{	//Vertex is within bounds
		return index >= 0 && index < adjMatrix.length;
	}
	public void printAdjMatrix()
	{	//Print full matrix of vertices
		for (int i = 0; i < adjMatrix.length; i++)
		{
			for (int j = 0; j < adjMatrix[i].length; j++)
			{
				System.out.print(adjMatrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	public void printDFS()
	{	//Default traversal
		markedList.clear();
		printDFS(0);
	}
	public void printDFSFrom(int index)
	{	//User input traversal 
		markedList.clear();
		if (index > 0)
		{
			printDFS(index);
		}
		else
		{
			printDFS(0);
		}
	}
	private void printDFS(int index)
	{
		System.out.println(index);
		markedList.add(index);
		for (int i = 0; i < adjMatrix.length; i++)
		{
			if (adjMatrix[index][i] != 0.0 && !markedList.contains(i))
			{
				printDFS(i);
			}
		}
	}
	public void printBFS()
	{
		markedList.clear();
		vQ.clear();
		markedList.add(0);
		vQ.add(0);
		System.out.println(0);
		while (!vQ.isEmpty())
		{
			int currI = vQ.remove();
			markedList.add(currI);
			for (int i = 0; i < adjMatrix.length; i++)
			{
				if (!markedList.contains(i) && !vQ.contains(i) && adjMatrix[currI][i] != 0.0)
				{
					System.out.println(i);
					vQ.add(i);
				}
			}
		}
	}
	public void printBFSFrom(int index)
	{	
		markedList.clear();
		vQ.clear();
		if (index > 0)
		{
			markedList.add(index);
			vQ.add(index);
			System.out.println(index);
		}
		else
		{
			markedList.add(0);
			vQ.add(0);
			System.out.println(0);
		}
		
		while (!vQ.isEmpty())
		{
			int currI = vQ.remove();
			markedList.add(currI);
			for (int i = 0; i < adjMatrix.length; i++)
			{
				if (!markedList.contains(i) && !vQ.contains(i) && adjMatrix[currI][i] != 0.0)
				{
					System.out.println(i);
					vQ.add(i);
				}
			}
		}
	}
}
