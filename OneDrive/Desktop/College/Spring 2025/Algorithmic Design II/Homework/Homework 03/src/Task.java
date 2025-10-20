
public class Task {
	//Sebastian Gaviria
	
	private int priority;
	private String task;
	
	public Task()
	{
		priority = 4;
		task = "none";
	}
	public Task(int xPriority, String xTask)
	{
		this.setPriority(xPriority);
		this.setTask(xTask);
	}
	public int getPriority()
	{
		return this.priority;
	}
	public String getTask()
	{
		return this.task;
	}
	public void setPriority(int xPriority)
	{
		if (xPriority > 4 || xPriority < 0)
		{
			priority = 4;
		}
		else
		{
			priority = xPriority;
		}
	}
	public void setTask(String xTask)
	{
		if (xTask == null)
		{
			task = "none";
		}
		else
		{
			task = xTask;
		}
	}
	public String toString()
	{
		return "Priority: " + this.getPriority() +
				"\t Task: " + this.getTask();
	}
	public boolean equals(Task t)
	{
		return t != null &&
				this.priority == t.getPriority() &&
				this.task.equals(t.getTask());
	}
}
