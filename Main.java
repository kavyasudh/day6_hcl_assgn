package day6_hcl_assgn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;




public class Main {

	public static void main(String[] args) {

		ArrayList<Book> books = new ArrayList<>();
		books.add(new Book(12, "c", 200, 320));
		books.add(new Book(11, "c++", 300, 350));
		books.add(new Book(13, "java", 350, 450));

		
		 
		  
		  
		  
		
		BookCollection bc = new BookCollection("kavya", books);
		System.out.println(bc.toString());
		
		
		
		 printBooks(books);
	}
		
		 private static void printBooks(ArrayList<Book> books) 
		 { 
			 for(Book book:books)
		  { 
				 System.out.println(book); 
				 } 
			 Collections.sort(books);
		  
			 System.out.println(books);
		 
		
			System.out.println("sorting as per Title...");
			Collections.sort(books, new BookSorterAsPerTitle());
			System.out.println(books);
			

	}
}

		