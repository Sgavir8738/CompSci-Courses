public interface QueueI <T> {
	//Sebastian Gaviria
	
	public void enqueue(T aData); //Add command to end of queue
	public T dequeue(); //Remove first command from queue
	public T peek(); //Returns first command without removing it
	public void print(); //Prints all commands to console

}
