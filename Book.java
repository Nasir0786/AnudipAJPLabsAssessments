package Collection;

import java.util.ArrayList;

public class Book {
	
	
	int bookId;
	String bookName;
	String authorName;
	

	public Book(int bookId, String bookName, String authorName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.authorName = authorName;
	}
	
	 public void displayBookDetails() {
	        System.out.println("Book ID: " + bookId);
	        System.out.println("Author Name: " + authorName);
	        System.out.println("Book Name: " + bookName);
	        System.out.println("-------------------------");
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<Book> bookList = new ArrayList<>();
		 
		 bookList.add(new Book(1,"k.L","Karma"));
		 bookList.add(new Book(2,"A.L","Qarma"));
		 bookList.add(new Book(3,"S.L","Earma"));
		 bookList.add(new Book(5,"D.L","Rarma"));
		 bookList.add(new Book(4,"F.L","Karma"));
		 bookList.add(new Book(6,"G.L","Tarma"));
		 bookList.add(new Book(7,"H.L","Tarma"));
		 
		 for (Book book : bookList) {
	            book.displayBookDetails();
	        }
	}

}
