
public class PetDemo {

	public static void main(String[] args) {

		//create an object of type Pet
		Pet p1 = new Pet();
		
		System.out.println(p1.toString());
		System.out.println();
		
		//create another object of type Pet
		Pet p2 = new Pet("Sprinklers", 5, "bird");

		System.out.println(p2.toString());
		System.out.println();
		
		Pet p3 = new Pet("Marshmallow", 10, "dog");
		
		System.out.println(p3.toString());
		System.out.println();
		
		System.out.println(p2.equals(p3));
	}

}
