public class Vector {
	//Sebastian Gaviria
	
	private int size;
	private double[] nums;
	
	public Vector()
	{
		this.size = 1;
		this.nums = null;
	}
	public Vector(int xSize, double[] xNums)
	{
		this.setSize(xSize);
		this.setNums(xNums);
	}
	public int getSize()
	{
		return this.size;
	}
	public double[] getNums()
	{
		return this.nums;
	}
	public void setSize(int xSize)
	{
		this.size = xSize;
	}
	public void setNums(double[] xNums)
	{
		this.nums = xNums;
	}
	public String toString()
	{
		String arrayString = "";
		for (int i = 0; i < this.size; i++)
		{
			arrayString += this.nums[i] + "\t";
		}
		
		return arrayString;
	}
}
