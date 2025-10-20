
public class UndergradDemo {

	public static void main(String[] args) {

		Person[] people = new Person[3];
		
		people[0] = new Person("Kennedy", 18);
		
		people[1] = new Student("Peter", 18, 2, 3.9, "Computer Science");
		
		people[2] = new Undergraduate("Kiara", 21, 4, 3.5, "Nursing", "History", 3);
		
		for (int i = 0; i < people.length; i ++)
		{
			people[i].writeOutput();
			System.out.println();
		}

	}

}
