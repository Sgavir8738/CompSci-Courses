
public class BookShelf {

	private Book[] books;
	
	public static final int MAX = 50;
	
	public BookShelf()
	{
		books = new Book[MAX];
	}
	
	public BookShelf(int count)
	{
		if (count > 0)
		{
			books = new Book[count];
		}
	}
	
	public Book[] getBooks()
	{
		return this.books;
	}
	
	public void insertBook(String xTitle, String xAuthor, double xPrice)
	{
		for (int i = 0; i < books.length; i ++)
		{
			if (books[i] == null)
			{
				books[i] = new Book(xTitle, xAuthor, xPrice);
				break;
			}
			else if ((i + 1) == books.length)
			{
				System.out.println("Bookshelf is full.");
			}
		}
	}
	
	public void deleteBook(Book bk)
	{
		for (int i = 0; i < books.length; i ++)
		{
			if (books[i] != null && books[i].equals(bk))
			{
				books[i] = null;
				break;
			}
			else if ((i + 1) == books.length)
			{
				System.out.print("Book not found.");
			}
		}
	}
	
	public boolean equals(BookShelf bkShelf)
	{
		for (int i = 1; i < books.length; i ++)
		{
			if ((books[i] == null && bkShelf.getBooks()[i] != null)
					|| (books[i].equals(bkShelf.getBooks()[i]) == false))
			{
				return false;
			}
			else
			{
				return true;
			}
		}
		
		return true;
	}
	
	public String toString()
	{
		String result = "";
		
		for (int i = 0; i < books.length; i ++)
		{
			if (books[i] != null)
			{
				result += books[i].toString() + "\n";
			}
		}
		
		return result;
	}
}
