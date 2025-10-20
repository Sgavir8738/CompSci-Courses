import java.util.Scanner;
public class BookDatabase {

	public static void main(String[] args) {

		Scanner key = new Scanner(System.in);
		
		BookShelf bk = new BookShelf();
		
		boolean quit = false;
		
		while (quit == false)
		{
			System.out.println("Welcome to the Gamecock library!" 
					+ "\nEnter 1 to add a book"
					+ "\nEnter 2 to remove a book"
					+ "\nEnter 3 for the book list in the library"
					+ "\nEnter 4 to exit the library:");
			
			int choice = key.nextInt();
			
			key.nextLine();
			
			switch (choice)
			{
			
			case 1: //add a book
				System.out.print("Enter the title of the book: ");
				
				String title = key.nextLine();
				
				System.out.print("Enter the author of the book: ");
				
				String author = key.nextLine();
				
				System.out.print("Enter the price of the book: ");
				
				double price = key.nextDouble();
				
				System.out.println();
				
				bk.insertBook(title, author, price);
				break;
			case 2: //delete a book
				System.out.print("Enter the title of the book: ");
				
				title = key.nextLine();
				
				System.out.print("Enter the author of the book: ");
				
				author = key.nextLine();
				
				System.out.print("Enter the price of the book: ");
				
				price = key.nextDouble();
				
				bk.deleteBook(new Book(title, author, price));
				break;	
			case 3: //view book list
				System.out.println(bk.toString());
				break;
			case 4: //exit the bookshelf
				quit = true;
				break;
			default:
				System.out.println("Invalid key entered.");
			}
		}
	}

}
