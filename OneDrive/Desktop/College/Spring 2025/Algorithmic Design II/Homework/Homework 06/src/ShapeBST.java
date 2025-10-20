import java.io.*;
public class ShapeBST {
	//Sebastian Gaviria

	public PrintWriter fileWriter;
	
	private class Node 
	{
		Shape data;
		Node leftChild;
		Node rightChild;
		public Node(Shape aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	private Node root;//head
	public ShapeBST()
	{
		root = null;
	}
	public void add(Shape aData)
	{
		if (root == null)
		{
			root = new Node(aData);
		}
		else
		{
			add(root, aData);
		}
	}
	private Node add(Node aNode, Shape aData)
	{
		if (aNode == null)
		{
			aNode = new Node(aData);
		}
		else if (aData.compareTo(aNode.data) < 0)//GO LEFT
		{
			aNode.leftChild = add(aNode.leftChild, aData);
		}
		else if (aData.compareTo(aNode.data) > 0)//GO RIGHT
		{
			aNode.rightChild = add(aNode.rightChild, aData);
		}
		return aNode;
	}
	public void printPreorder()
	{
		printPreorder(root);
	}
	private void printPreorder(Node aNode)
	{
		if (aNode == null)
		{
			return;
		}
		System.out.println(aNode.data);//PROCESS
		printPreorder(aNode.leftChild);//LEFT
		printPreorder(aNode.rightChild);//RIGHT
	}
	public void printInorder()
	{
		printInorder(root);
	}
	private void printInorder(Node aNode)
	{
		if (aNode == null)
		{
			return;
		}
		printInorder(aNode.leftChild);//LEFT
		System.out.println(aNode.data);//PROCESS
		printInorder(aNode.rightChild);//RIGHT
	}
	public void printPostorder()
	{
		printPostorder(root);
	}
	private void printPostorder(Node aNode)
	{
		if (aNode == null)
		{
			return;
		}
		printPostorder(aNode.leftChild);//LEFT
		printPostorder(aNode.rightChild);//RIGHT
		System.out.println(aNode.data);//PROCESS
	}
	public boolean search(Shape aData)
	{
		return search(root, aData);
	}
	private boolean search(Node aNode, Shape aData)
	{
		if (aNode == null)
		{
			return false;
		}
		else if (aData.compareTo(aNode.data) < 0)//GO LEFT
		{
			return search(aNode.leftChild, aData);
		}
		else if (aData.compareTo(aNode.data) > 0)//GO RIGHT
		{
			return search(aNode.rightChild, aData);
		}
		else
		{
			return true;
		}
	}
	public void remove(Shape aData)
	{
		root = remove(root, aData);
	}
	private Node remove(Node aNode, Shape aData)
	{
		if (aNode == null)
		{
			return null;
		}
		else if (aData.compareTo(aNode.data) < 0)
		{
			aNode.leftChild = remove(aNode.leftChild, aData);
		}
		else if (aData.compareTo(aNode.data) > 0)
		{
			aNode.rightChild = remove(aNode.rightChild, aData);	
		}
		else
		{
			if (aNode.rightChild == null)
			{
				return aNode.leftChild;
			}
			else if (aNode.leftChild == null)
			{
				return aNode.rightChild;
			}
			Node temp = findMinInTree(aNode.rightChild);
			aNode.data = temp.data;
			aNode.rightChild = remove(aNode.rightChild, temp.data);
		}
		return aNode;
	}
	private Node findMinInTree(Node aNode)
	{
		if (aNode == null)
		{
			return null;
		}
		else if (aNode.leftChild == null)
		{
			return aNode;
		}
		else
		{
			return findMinInTree(aNode.leftChild);
		}
	}
	public void printLargest()
	{
		printLargest(root);
	}
	private void printLargest(Node aNode)
	{
		if (aNode.rightChild == null)
		{
			System.out.println(aNode.data);
			return;
		}
		printLargest(aNode.rightChild);
		
	}
	public Shape findLargest()
	{
		 return findLargest(root);
	}
	private Shape findLargest(Node aNode)
	{
		if (aNode.rightChild == null)
		{
			return aNode.data;
		}
		return findLargest(aNode.rightChild);
	}
	public void removeGreaterThan(double xArea)
	{
		while (xArea < findLargest().getArea())
		{	//Looping condition
			root = removeGreaterThan(root, xArea);
		}
	}
	public Node removeGreaterThan(Node aNode, double xArea)
	{
		if (aNode == null)
		{
			return null;
		}
		if (xArea < (root.data).getArea())
		{	//Go left if max area is smaller than root of the tree
			aNode.leftChild = removeGreaterThan(aNode.leftChild, xArea);
		}
		if (xArea < (aNode.data).getArea())
		{
			if (aNode.rightChild == null)
			{
				return aNode.leftChild;
			}
			else if (aNode.leftChild == null)
			{
				return aNode.rightChild;
			}
			Node temp = findMinInTree(aNode.rightChild);
			aNode.data = temp.data;
			aNode.rightChild = removeGreaterThan(aNode.rightChild, xArea);
		}
		else
		{
			aNode.leftChild = removeGreaterThan(aNode.leftChild, xArea);
			aNode.rightChild = removeGreaterThan(aNode.rightChild, xArea);
		}
		return aNode;
	}
	public void writeShapeFile(String fileName)
	{
		try 
		{
			fileWriter = new PrintWriter(new FileOutputStream(fileName));
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		writeShapeFile(root, fileName);
		fileWriter.close();
	}
	private void writeShapeFile(Node aNode, String fileName)
	{
		if (aNode == null)
		{
			return;
		}
		fileWriter.println(aNode.data.toFile());
		writeShapeFile(aNode.leftChild, fileName);	
		writeShapeFile(aNode.rightChild, fileName);
	}
}
