public class HeapTester {

	public static void main(String[] args) {
		MinHeap<Integer> iHeap = new MinHeap<Integer>();
		MaxHeap<String> sHeap = new MaxHeap<String>();
		Integer[] iArray = {5, 1, 4, 3, 6, 2};
		
		sHeap.add("a");
		sHeap.add("aAa");
		sHeap.add("aa");
		sHeap.add("aaaa");
		sHeap.add("aaaaaaa");
		
		sHeap.print();
		
		sHeap.remove();
		sHeap.print();
		
		iHeap.heapSort(iArray);
		for (Integer i : iArray)
		{
			System.out.println(i);
		}
	}

}
