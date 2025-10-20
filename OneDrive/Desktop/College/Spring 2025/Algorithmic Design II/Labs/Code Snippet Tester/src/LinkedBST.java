public class LinkedBST {
	//Sebastian Gaviria
	
	private class Node 
	{
		private double data;
		private Node leftChild;
		private Node rightChild;
		public Node(double aData)
		{
			data = aData;
			leftChild = rightChild = null;
		}
	}
	private Node root;//head
	/*public LinkedBST()
	{
		root = null;
	}
	*/
	public double findSum()
	{
		return findSum(root);
	}
	private double findSum(Node aNode)
	{
		if (aNode == null)
		{
			return 0;
		}
		return aNode.data + findSum(aNode.leftChild) + findSum(aNode.leftChild);
	}
	public void add(double aData)
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
	private Node add(Node aNode, double aData)
	{
		if (aNode == null)
		{
			aNode = new Node(aData);
		}
		else if (aData < aNode.data)//GO LEFT
		{
			aNode.leftChild = add(aNode.leftChild, aData);
		}
		else if (aData > aNode.data)//GO RIGHT
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
	public boolean search(double aData)
	{
		return search(root, aData);
	}
	private boolean search(Node aNode, double aData)
	{
		if (aNode == null)
		{
			return false;
		}
		else if (aData < aNode.data)//GO LEFT
		{
			return search(aNode.leftChild, aData);
		}
		else if (aData > aNode.data)//GO RIGHT
		{
			return search(aNode.rightChild, aData);
		}
		else
		{
			return true;
		}
	}
	public void remove(double aData)
	{
		root = remove(root, aData);
	}
	public Node remove(Node aNode, double aData)
	{
		if (aNode == null)
		{
			return null;
		}
		else if (aData < aNode.data)
		{
			aNode.leftChild = remove(aNode.leftChild, aData);
		}
		else if (aData > aNode.data)
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
}
