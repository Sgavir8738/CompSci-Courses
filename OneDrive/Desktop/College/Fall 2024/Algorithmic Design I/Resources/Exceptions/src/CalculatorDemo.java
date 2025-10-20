
public class CalculatorDemo {

	public static void main(String[] args) {

		Calculator c = new Calculator();
		
		c.calculate();

		System.out.println("The first calc method: " + c.calc(5));
		
		System.out.println("The second calc method: " + c.calc("123.5"));
		
		System.out.println("The calc2 method: " + c.calc2("7"));
	}

}
