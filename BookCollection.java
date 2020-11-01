package day6_hcl_assgn;

import java.util.ArrayList;
import java.util.List;



public class BookCollection {

	private String owner;
	private ArrayList<Book> Books;
	public BookCollection(String owner, ArrayList<Book> books) {
		super();
		this.owner = owner;
		Books = books;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public List<Book> getBooks() {
		return Books;
	}
	public void setBooks(ArrayList<Book> books) {
		Books = books;
	}
	@Override
	public String toString() {
		return "BookCollection [owner=" + owner + ", Books=" + Books + "]";
	}
	
	
	
}
