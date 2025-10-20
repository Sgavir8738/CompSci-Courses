
public interface QueueI <T> {
	//Sebastian Gaviria
	public void enqueue(T aData); //Add element to end of queue
	public T dequeue(); //Remove first element from queue
	public T peek(); //Returns first queue element without removing it
	public void print();

}
