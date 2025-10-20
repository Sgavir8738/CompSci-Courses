
public class Shapes {
	
	private int offset;
	
	public Shapes()
	{
		this.offset = 0;
	}
	
	public Shapes(int xOffset)
	{
		this.setOffset(xOffset);
	}
	
	public int getOffset()
	{
		return this.offset;
	}
	
	public void setOffset(int xOffset)
	{
		if (xOffset > 0)
		{
			this.offset = xOffset;
		}
	}
	
	public void drawAt(int lineNumber)
	{
		for (int i = 0; i < lineNumber; i ++)
		{
			System.out.println();
		}
		
		drawHere();
	}
	
	public void drawHere()
	{
		for (int i = 0; i < this.offset; i ++)
		{
			System.out.print(" ");
		}
		
		System.out.print("*");
	}
}
