
public class MinHeap <T extends Comparable<T>> {

	private T[] heap;
	private int lastIndex;//first null element
	private static final int DEF_SIZE = 128;
	
	
	public MinHeap()
	{
		init(DEF_SIZE);
	}
	public MinHeap(int aSize)
	{
		init(aSize);
	}
	private void init(int aSize)
	{
		if (aSize < 0)
		{
			init(DEF_SIZE);
		}
		heap = (T[]) new Comparable[aSize];
	}
	public void add(T aData)
	{
		if (lastIndex >= heap.length)
		{
			return;
		}
		heap[lastIndex] = aData;
		bubbleUp();
		lastIndex++;
	}
	private void bubbleUp()
	{
		int index = lastIndex;
		while (index > 0 && heap[(index - 1) / 2].compareTo(heap[index]) > 0)
		{
			T temp = heap[(index - 1) / 2];
			heap[(index - 1) / 2] = heap[index];
			heap[index] = temp;
			index = (index - 1) / 2;
		}
	}
	public T remove()
	{
		if (lastIndex == 0)
		{
			return null;
		}
		T ret = heap[0];
		heap[0] = heap[lastIndex - 1];
		heap[lastIndex - 1] = null;
		lastIndex--;
		bubbleDown();
		return ret;
	}
	private void bubbleDown()
	{
		int index = 0;
		while (index * 2 + 1 < lastIndex)
		{
			int smallIndex = index * 2 + 1;
			if (index * 2 + 2 < lastIndex && heap[smallIndex].compareTo(heap[index * 2 + 2]) > 0)
			{
				smallIndex = index * 2 + 2;
			}
			if (heap[index].compareTo(heap[smallIndex]) > 0)
			{
				T temp = heap[index];
				heap[index] = heap[smallIndex];
				heap[smallIndex] = temp;
			}
			else
			{
				break;
			}
			index = smallIndex;
		}
	}
	public void print()
	{
		for (int i = 0; i < lastIndex; i++)
		{
			System.out.println(heap[i]);
		}
	}
	public void heapSort(T[] array)
	{
		if (array == null)
		{
			return;
		}
		MinHeap<T> mHeap = new MinHeap(array.length);
		for (int i = 0; i < array.length; i++)
		{
			mHeap.add(array[i]);
		}
		for (int i = 0; i < array.length; i++)
		{
			array[i] = mHeap.remove();
		}
	}
}
