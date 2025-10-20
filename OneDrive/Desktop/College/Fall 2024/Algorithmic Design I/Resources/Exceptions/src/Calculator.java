import java.util.Scanner;
public class Calculator {
	
	private double result;
	private double precision = 0.000001;
	
	//default constructor
	public Calculator()
	{
		this.result = 0;
	}
	
	//parameterized constructor
	public Calculator(double xResult)
	{
		this.setResult(xResult);
	}

	//accessor
	
	public double getResult()
	{
		return this.result;
	}
	
	//mutator
	public void setResult(double xResult)
	{
		this.result = xResult;
	}

	public void calculate()
	{
		boolean done = false;
		
		Scanner key = new Scanner(System.in);
		
		while (!done)
		{
			System.out.println("Result = " + this.result);
			
			char op = key.next().charAt(0);
			
			if (op == 'E' || op == 'e')
			{
				System.out.println("Exiting the program.");
				
				done = true;
			}
			else
			{
				double num2 = key.nextDouble();
				
				try
				{
					this.result = evaluate(op, this.result, num2);
				}
				catch (DivisionByZeroException e)
				{
					System.out.println(e.getMessage());
				}
				catch (UnknownOperatorException e)
				{
					System.out.println(e.getMessage());
				}
				catch (Exception e)
				{
					System.out.println(e.getMessage());
				}
				finally
				{
					
				}
			}
			
		}
	}
		
		public double evaluate(char op, double num1, double num2) throws DivisionByZeroException, UnknownOperatorException 
		{
			double answer = 0;
			
			switch (op)
			{
			
			case '+':
				answer = num1 + num2;
				break;
			
			case '-':
				answer = num1 - num2;
				break;
			
			case '*':
				answer = num1 * num2;
				break;
			
			case '/':
				if (num2 < precision && num2 > -precision)
				{
					throw new DivisionByZeroException();
				}
				else
				{
					answer = num1 / num2;
				}
				break;
				
			default:
				throw new UnknownOperatorException();
			}
			
			return answer;
		}
		
		//other methods
		public double calc(double s)
		{
			return s;
		}
		
		//wrapper classes
		public double calc(String s)
		{
			double num = Double.parseDouble(s);	
			return num;
		}
		
		public int calc2(String s)
		{
			int num = 5 + Integer.parseInt(s);
			
			return num;
		}
		
}
