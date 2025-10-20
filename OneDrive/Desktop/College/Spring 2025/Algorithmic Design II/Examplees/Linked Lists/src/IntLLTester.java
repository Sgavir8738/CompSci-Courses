
public class IntLLTester {

	public static void main(String[] args) {
		IntLL ILL;
		ILL = new IntLL();
		
		for (int i = 4; i >= 0; i--)
		{
			ILL.add(i);
		}
		
		ILL.print();
		ILL.addAfterCurrent(22);
		ILL.print();
		
		ILL.gotoNext();
		ILL.addAfterCurrent(23);
		ILL.print();
		
		ILL.setCurrent(42);
		ILL.print();
		
		ILL.removeCurrent();
		ILL.print();
	}

}
