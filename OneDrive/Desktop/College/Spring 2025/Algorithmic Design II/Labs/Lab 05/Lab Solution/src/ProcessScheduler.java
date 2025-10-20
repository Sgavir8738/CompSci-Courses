
public class ProcessScheduler {
	//Sebastian Gaviria
		
	QueueI<Process> processQueue;
	Process currentProcess;
	
	public ProcessScheduler()
	{
		processQueue = new LLQueue();
	}
	public Process getCurrentProcess()
	{
		return currentProcess;
	}
	public void addProcess(Process p)
	{
		if (currentProcess != null)
		{	//Adds process to queue unless no process is running
			processQueue.enqueue(p);
		}
		else
		{
			currentProcess = p;
		}
	}
	public void runNextProcess()
	{
		currentProcess = processQueue.dequeue();
	}
	public void cancelCurrentProcess()
	{
		currentProcess = null;
		currentProcess = processQueue.dequeue();
	}
	public void printProcessQueue()
	{
		processQueue.print();
	}
}
