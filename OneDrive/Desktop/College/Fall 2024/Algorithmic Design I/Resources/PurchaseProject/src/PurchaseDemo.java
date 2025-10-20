
public class PurchaseDemo {

	public static void main(String[] args) {

		Purchase pc1 = new Purchase();
		
		System.out.println(pc1.toString());
		System.out.println();
		
		Purchase pc2 = new Purchase("Laptop", 400, 1);
		
		System.out.println(pc2.toString());
		System.out.println();
		
		Purchase pc3 = new Purchase(pc2);
		
		System.out.println(pc3.toString());
		System.out.println();
		
		System.out.println("The total cost of the second object is $" + pc2.totalCost());

		Purchase pc4 = new Purchase("Headphones", 50, 3);
		
		System.out.println("The total cost of the fourth object is $" + pc4.totalCost());
		
		System.out.println("The updated total Cost for 4 units is $" + pc4.totalCost(4));
		
		System.out.println("The second updated total cost is $" + pc4.totalCost(5, 55));
	}

}
